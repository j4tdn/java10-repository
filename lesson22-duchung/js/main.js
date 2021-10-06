let ballons = ["blue", "green", "red", "violet", "yellow"];

let width = window.innerWidth;
let height = window.innerHeight;
let core = 0;
let totalCore = 18;
let timeGame = 14000;
let gameOver = false;

let scores = document.querySelectorAll('.score');
let restart = document.querySelector('.restart')
let cancel = document.querySelector('.cancel')
let notify_result = document.querySelector('.notify_result');
let audioDel = document.querySelector('#audio_del');
let audioGame = document.querySelector('#audio_game');

function  createBalloon (){
    let widthWindow = width - 150;
    let img = document.createElement('img'); 
    let random = Math.floor(Math.random() * ballons.length);
    img.className= 'balloon'
    img.src = 'images/balloon-' + ballons[random] + '.png';
    img.style.top = height + 'px';
    random = Math.floor(Math.random() * widthWindow);
    img.style.left = random + 'px';
    document.body.appendChild(img);
    animateBalloon(img);
}

function animateBalloon (even) {
    let pos = 0;
    let heightWindown = height + 350;
    let random = Math.floor(Math.random() * 14);
    let interval = setInterval(frame, 8 + random);  
    function frame() {
        if(pos >= heightWindown ){       
            clearInterval(interval);
        }else{
            pos++;  
            even.style.top = height - pos + 'px';
        }
    }
}

function showNotifyResult(showClass) {
    notify_result.style.display = 'flex';
    notify_result.querySelector(showClass).style.display = 'block';
}

function restartGame() {
    let Balloon = document.querySelectorAll('.balloon');
    for( let i = 0; i < Balloon.length; i++){
        Balloon[i].remove();
    }
    gameOver = false;
    core = 0;
    updateScore();
}

function startGame(){
    audioGame.play();
    restartGame();
    let loop = setInterval(() => {
        if(gameOver ==  true){
            clearInterval(loop);
            showNotifyResult('.loser')
        }else if(core == totalCore){
            clearInterval(loop);
            showNotifyResult('.winner')
        }else{
            createBalloon();
        }
    },400)
    setTimeout(() => {
        gameOver = true;
    }, timeGame)
}

function deleteB (even) {
    audioDel.play();
    even.remove();
    core++;
    updateScore();
}

document.addEventListener('click', function (even){
    if(even.target.classList.contains('balloon')){
        deleteB(even.target);
    }
})


function updateScore() {
    for(let i = 0; i < scores.length; i++){
    scores[i].textContent = core;
    }   
}


restart.addEventListener('click', function() {
    notify_result.style.display = 'none';
    notify_result.querySelector('.winner').style.display = 'none';
    notify_result.querySelector('.loser').style.display = 'none';   
    startGame();
})

cancel.addEventListener('click', function() {
    notify_result.style.display = 'none';
});

startGame();