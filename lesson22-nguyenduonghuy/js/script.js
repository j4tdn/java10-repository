// DOM Node is an object that we query from an HTML element such as body, span, header, etc.
// DECLARATION

let body = document.body;
const colors = ['blue', 'green', 'red', 'violet', 'yellow'];

// CSS object
let overlay = document.querySelector('.overlay');

// window.innerWidth # screen.Width
const innerWidth = window.innerWidth;
const innerHeight = window.innerHeight;
const balloonWidth = 100;
const balloonHeight = 200;

let popScore = 0;
let missedScore = 0;

let total = 15;
let missedBalloon = 5;

let gameOver = false;

let lose_popup = document.getElementById('lose-popup');
let querySelector = document.querySelector('.overlay');
// MAIN
function startGame() {
    let timeout = 0;
    let interval = setInterval(() => {
        timeout = random(600);

        createBalloon();

        // if score === total
        // clearInterval(interval)
        // show win popups

        if (popScore === total) {
            clearInterval(interval);
            lose_popup.classList.remove('hidden');
            querySelector.classList.remove('hidden');
        } else if (missedScore === missedBalloon) {
            clearInterval(interval);
            console.log("You lose");
        }

    }, 1000 + timeout);
};

startGame();

// UTILITY FUNCTIONS 
function random(bound) {
    return Math.trunc(Math.random() * bound);
}

// CREATE A BALOON 
function createBalloon() {

    let randColorPos = random(colors.length + 1);

    // create a div element in DOM
    let balloon = document.createElement('div');
    balloon.className = `balloon balloon-${colors[randColorPos]}`;

    // set position for baloon in screen
    let randHorizontalPos = random(innerWidth - 100);
    balloon.style.left = randHorizontalPos + 'px';

    // append the baloon to the body
    body.appendChild(balloon);

    balloonTranslation(balloon);
}

// MAKE A BALOON MOVE
function balloonTranslation(balloon) {
    let movedDistance = 0;
    let interval = setInterval(() => {
        movedDistance++;

        // if the ballon gets over the inner height
        // -> stop the interval
        if (movedDistance >= innerHeight + balloonHeight) {
            missedScore++;
        }
        balloon.style.top = (innerHeight - movedDistance) + 'px';
    }, 5);
}

// b1: return the position of click's event
// b2: remove the class name (remove the balloon)
document.addEventListener('click', function (event) {
    if (event.target.classList.contains('balloon')) {
        // event.target returns a balloon object
        deleteBalloon(event.target);
    }
});

function deleteBalloon(balloon) {
    // removes a div (DOM element)
    // definition: removes the element from the tree it belongs to. 
    balloon.remove();
    popScore++;
    updateScores();
    sound();
}

function updateScores() {
    // win, lost, scoreboard
    let updateScore = document.querySelectorAll('.score');
    for (let i = 0; i < updateScore.length; i++) {
        updateScore[i].textContent = popScore;
    }
}

function sound() {
    let audio = document.createElement('audio');
    audio.src = '../sounds/pop.mp3';
    audio.play();
}