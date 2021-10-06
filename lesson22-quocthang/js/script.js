let body = document.body;
const windowWidth = window.innerWidth;
const windowHeight = window.innerHeight;

const balloonWidth = 100;
const balloonHeight = 200;

let totalShadow = document.querySelector('.total-shadow');

let colors = ['blue', 'green', 'red', 'violet', 'yellow'];
let score = 0;
let total = 15;
let gameOver = false;
let balloonId = 0;
let init = true;

function createBalloon() {
    let rand = random(colors.length);

    // random color
    let balloon = document.createElement('div');
    balloon.className = 'balloon balloon-' + colors[rand];

    // random position
    rand = random(windowWidth - balloonWidth);
    balloon.style.left = rand + 'px';

    balloon.dataset.id = balloonId++;
    body.appendChild(balloon);
    animate(balloon);
}

function animate(balloon) {
    // callback function, timeout
    let moved = 0;
    let interval = setInterval(function() {
        moved++;
        // HTMLElement.remove >> element not exist in document
        // document.querySelector('[data-id="3"]');
        let isPoped = document.querySelector('[data-id="' + balloon.dataset.id + '"]') === null;
        if (!isPoped && (moved >= windowHeight + balloonHeight)) {
            clearInterval(interval);
            gameOver = true;
        } else {
            balloon.style.top = windowHeight - moved + 'px';
        }
    }, 12 - score/ 10);
}

function pop(balloon) {
    balloon.remove();
    score++;
    updateScores();
    playSound();
}

/* pop */
document.addEventListener('click', function (event) {
    if (event.target.classList.contains('balloon')) {
        pop(event.target);
    }
})

document.querySelector('.restart').addEventListener('click',function() {
    totalShadow.style.display = 'none';
    totalShadow.querySelector('.lose').style.display = 'none';
    //totalShadow.querySelector('.win').style.display = 'none';
    
    startGame();
})

document.querySelector('.quit').addEventListener('click',function() {
    totalShadow.style.display = 'none';
})

function reset() {
    let balloons = document.querySelectorAll('.balloon');
    for (let balloon of balloons) {
        balloon.remove();
    }

    score = 0;
    updateScores();
    gameOver = false;
}

function startGame() {
    document.querySelector('.win-score').textContent = total;

    //restart Game
    if (!init){
        reset();
    }
        init = false;
    
    let timeOut  = 0;
    let interval = setInterval(function() {
        timeOut = random(400)  
        if(!gameOver) {
            createBalloon();
            if(score === total){
               showPopup('.win');
               clearInterval(interval);
            }
        } else {
          showPopup('.lose');
          clearInterval(interval);
        }
        
    },400 + timeOut);
};

startGame();


/* until function */
function showPopup(popupClass) {
    totalShadow.style.display = 'flex';
    totalShadow.querySelector(popupClass).style.display = 'block';
}

function updateScores() {
    let scores = document.querySelectorAll('.score')
    for (let i = 0; i < scores.length; i++) {
        scores[i].textContent = score;
    }
}

function playSound() {
    let audio = document.createElement('audio');
    audio.src = 'sounds/pop.mp3';
    audio.play();
}

function random(bound) {
    return Math.floor(Math.random() * bound);
}