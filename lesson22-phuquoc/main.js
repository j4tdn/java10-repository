const ballons = ["blue", "green", "red", "violet", "yellow"];

let width = window.innerWidth;
let height = window.innerHeight;

let noPop = 0;
let total = 15;
let currentBalloon = 0;
let timeGame = 10000;
let gameOver = false;

const scores = document.querySelectorAll('.score');
const notif = document.querySelector('.notif');
const start = document.querySelector('.start-btn');
const restart = document.querySelector('.restart')
const cancel = document.querySelector('.cancel')
const audioPop = document.querySelector('#audio');
const audioG = document.querySelector('#audio-game');

const createBalloon = () => {
    let widthWindow = width - 150;
    let img = document.createElement('img'); 
    let random = Math.floor(Math.random() * ballons.length);
    img.className= 'balloon'
    img.src = 'images/balloon-' + ballons[random] + '.png';
    random = Math.floor(Math.random() * widthWindow);
    img.style.left = random + 'px';
    img.dataset.number = currentBalloon;
    currentBalloon++;
    document.body.appendChild(img);
    animateBalloon(img);
}

const animateBalloon = (e) => {
    let position = 0;
    let heightWindown = height + 300;
    let random = Math.floor(Math.random() * 6 -3);
    let interval = setInterval(frame, 12 - Math.floor(noPop / 10) + random);

    function frame() {
        if(position >= heightWindown ){
            clearInterval(interval);
        }else{
            position++;
            e.style.top = height - position + 'px';
        }
    }
}

function startGame(){
    restartGame();
    gameOver = false;
    let timeout = 0;
    let loop = setInterval(() => {
        timeout = Math.floor(Math.random() * 600);
        if(gameOver == true){
            clearInterval(loop);
            notif.style.display = 'flex';
            notif.querySelector('.loser').style.display = 'block';
        }else if(noPop == total){
            clearInterval(loop);
            notif.style.display = 'flex';
            notif.querySelector('.winner').style.display = 'block';
        }else{
            createBalloon();
        }
    }, 500 + timeout)
    setTimeout(() => {
        gameOver = true;
    }, timeGame)
}

const updateScore = () => {
    for(let i = 0; i < scores.length; i++){
    scores[i].textContent = noPop;
    }   
}

const restartGame = () => {
    let removeBalloon = document.querySelectorAll('.balloon');
    for( let i = 0; i < removeBalloon.length; i++){
        removeBalloon[i].remove();
    }
    gameOver = false;
    noPop = 0;
    updateScore();
}

const deleteBuble = (e) => {
    audioPop.play();
    e.remove();
    noPop++;
    updateScore();
}

document.addEventListener('click', (e) => {
    if(e.target.classList.contains('balloon')){
        deleteBuble(e.target);
    }
})

start.addEventListener('click', () => {
    startGame();
    audioG.play();
    document.querySelector('.main-game').style.display = 'none'
})

restart.addEventListener('click', () => {
    notif.style.display = 'none';
    notif.querySelector('.winner').style.display = 'none';
    notif.querySelector('.loser').style.display = 'none';   
    startGame();
})

cancel.addEventListener('click', () => {
    notif.style.display = 'none';
});

