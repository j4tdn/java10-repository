const $ = document.querySelector.bind(document);
const $$ = document.querySelectorAll.bind(document);

const app = {
    balloons : [
        {
            name: 'blue',
            speed: 8,
            url : './images/balloon-blue.png'
        },
        {
            name: 'green',
            speed: 9,
            url : './images/balloon-green.png'
        },
        {
            name: 'red',
            speed: 10,
            url : './images/balloon-red.png'
        },
        {
            name: 'violet',
            speed: 11,
            url : './images/balloon-violet.png'
        },
        {
            name: 'yellow',
            speed: 12,
            url : './images/balloon-yellow.png'
        }
    ],
    speed: 0,
    point : 0,
    totalBalloons : 100,
    start : function() {
        new Audio('./sounds/bg-music.mp3').play();
        var zIndex = 0;
        for(let i = 0; i < app.totalBalloons; i++) {
            setTimeout(function() {
                let balloon = createBalloon(zIndex++);
                balloon.addEventListener('click', function(e) {
                    balloon.remove();
                    new Audio('./sounds/pop.mp3').play();
                    $('.point-bar').innerText = `You popped ${++app.point} ballonons`;
                });
            }, 500 * i);
        }

        setInterval(function() {
            if(app.totalBalloons === app.point) {
                app.showHappyDialog();
            }
            let balloons = $$('.balloon');
            balloons.forEach(function(balloon){
                let speed = balloon.getAttribute('speed');
                let translateY = getTranslateY(balloon);
                if(translateY > -window.innerHeight - 160) {
                    balloon.style.transform = `translateY(${translateY - (2 * speed)}px)`;
                } else {
                    app.showSadDialog();
                }
            })
        }, 150);
    },
    showSadDialog : function() {
        $('#modal-sad span').innerText = `You popped ${app.point} balloons`;
        $('#modal-sad').classList.remove('hide');
    },
    showHappyDialog : function() {
        $('#modal-happy span').innerText = `You popped ${app.point} balloons`;
        $('#modal-happy').classList.remove('hide');
    }
}

function getTranslateY(myElement) {
    let style = window.getComputedStyle(myElement);
    let matrix = new WebKitCSSMatrix(style.transform);
    return matrix.m42;
}

$('#yes').addEventListener('click', function(e) {
    window.location.reload();
})

$('#no').addEventListener('click', function(e) {
    // todo
})

class Balloon {
    constructor() {
        let randomIndex = Math.floor(Math.random() * 5);
        this.name = app.balloons[randomIndex].name;
        this.speed = app.balloons[randomIndex].speed;
        this.url = app.balloons[randomIndex].url;
    }
}


function createBalloon(zIndex) {
    let balloon = new Balloon();
    let img = document.createElement('img');
    img.src = balloon.url;
    $('main').appendChild(img);
    img.classList.add('balloon');
    img.style.left = Math.round(Math.random() * (window.innerWidth - 80)) + 'px';
    img.setAttribute('speed', balloon.speed);
    img.style.zIndex = zIndex;
    return img;
}

app.start();
