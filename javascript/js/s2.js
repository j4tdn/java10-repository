
/* Callback function*/
/*function processUserFromInput(welcome){
	let name = prompt('Enter your name ');
	welcome(name);
}

function greeting(s){
		console.log(`welcome ${s} to the page`);

}

//processUserFromInput(greeting);
processUserFromInput(name => console,log(`welcome ${s} to the page`));


function operate(manupulate){
	let a = +prompt('Enter a');
	let b = +prompt('Enter b');
	alert("sum: "+ manipulate(a,b));
}
operate((a,b) => a+b);
callback function
*/
 /* interval , timeout

 let counter =0;
let randItv = setInterval(function(){
	console.log('Interval: '+ Math.random());
	if(counter ++===5){
		clearInterval(randItv);
	}
},1000);

let randTo = setTimeout(function(){
	console.log(`Timeout: ${Math.random()*10}`)

},300);*/

//global scope
/*let digit =8;
let text ='welcome';

	//let, const: block scope{}
	//var       : function scope

function printDigit(){

	//local - funtion scope
	console.log(digit);

	for (let i =0; i<digit; i++){
	//local - block scope
	let forVar = 'forVar';
	console.log('i >> ' + i );
	}
	//compile type var x = new HashMap();
	console.log('i36 >>' +i);
	console.log('forVar >>' +forVar);

}

function printText(){
	console.log(text);

}

printDigit();
printText();*/

let months = ['February', 'March', 'April'];

/*
push(e)     >> push(lenght-1,e)
pop   		>> remove(lenght-1)
unshift		>> add(0,e)
shift 		>> remove(0)
slice    	>> subList(a,b)
splice (idx, count?)     >> remove (idx, count?)
splice (idx, count?, items)

+count =0 >> splice(idx, count?, items) >> addAll(idx, item)
*/

