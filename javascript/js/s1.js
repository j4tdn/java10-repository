//alert("welcome to alert");
//alert("how are you");

//let text;
//console.log('value: '+ text);
//console.log('type: '+ (typeof text));


let text = 'Loosely type';
console.log('length: ' + text.length);


//forindex
for(let i in text){
	console.log(text[i]);
}
// foreach
for(let letter of text){
	console.log(letter);
}

//Javascript  page >> window, document, method
let isAdult = confirm('Are you 18 years old or older?');
alert('isAdult' +isAdult);

//everything is object
let sub = (a,b)=> {
	return a - b;
}

console.log("sub: " + sun(7,4));


