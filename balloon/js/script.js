


let winWid = window.innerWidth;
let winHei = window.innerHeight;
let colors = ['yellow','blue', 'green', 'red', 'violet', ];

function create(){
	let rd = random(colors.length);

	let balloon = document.createElement('div');
	balloon.className = 'balloon' + colors[rd];


    
    rd = random(winWid-100); 
    balloon.style.left = rd + 'px';
		
	document.body.appendChild(balloon);
    move(balloon);
}
function random(bound){
 	return Math.floor(Math.random() * bound);
 }
function move(balloon){
	
	let transfer = 0;
	setInterval( function(){
       transfer ++;
       balloon.style.top = (winHei - transfer) + 'px';
	}, 10);
}

function start(){
	setInterval(function(){
		create()}, 500);
};


 