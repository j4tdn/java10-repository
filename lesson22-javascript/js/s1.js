// alert("Welcome to Java Script Class");
// alert("How are you?");


let text = "Page index.html";
console.log('value: ' + text);

// 'typeof' gets runtime type of variable
console.log('type: ' + (typeof text));

let digit = 120;
console.log("digit value 1: " + digit);
console.log("digit value 2: " + digit);
console.log('digit value 3: ${digit}');
console.log("digit value 4: " + (typeof digit));

console.log("==================================");

// dynamic type
let dnm;
console.log(typeof dnm); // undefined (not yet assigned a value)

dnm = 'type';
console.log(typeof dnm); // string

dnm = true;
console.log(typeof dnm); // boolean

dnm = null;
console.log(typeof dnm); // null

dnm = 11;
console.log(typeof dnm); // number

console.log("==================================");
// string as array
text = "Loosely type"; // string
console.log('length: ' + text.length);

// for index
for (let i in text) {
	console.log(text[i]);
}

// forEach

for (let letter of text) {
	console.log(letter)
}

// Javascript page >> window, document, method
// let isAdult = confirm("Are you 18 year old or older?");
// alert("isAdult: " + isAdult);

let accepted = confirm("Do you want to play the game ?");
// == ===
if (accepted == true) {
	let a = +prompt("Enter a", '0'); // 10
	let b = +prompt("Enter b", '0');  // 5


	alert("Result: " + sum(a, b));
}

// declaration function 
function sum(a, b) {
	return a + b;
}
// expression function, anonymous function
// everything is bbject
let sub = (a, b) => {
	return a - b;
}

console.log("sub: " + sub(4, 1));

// ARRAY
let months = ["Jan", "Feb", "Mar", "Apr", "May"];
months.slice(1, 4);
console.log(months[0]);

// Object
let person = {
	name: "Daniel",
	surname: "Jones",
	age: 28,
	sex: "male"
}

console.log(person.age);
console.log(person.name);
console.log(person.surname);

// should assign value in this way
person["surname"] = "Whitman";

console.log(person.surname);


// An array of object 
let friends = [
	{
		name: "Quang",
		age: 20,
		parents: [
			{
				name: "Tom",
				age: 62
			},
			{
				name: "Joe",
				age: 60
			}
		]
	},
	{
		name: "Nghia",
		age: 22,
		parents: [
			{
				name: "Jaden",
				age: 73
			},
			{
				name: "Emily",
				age: 70
			}
		]
	},
	{
		name: "Tuan",
		age: 20
	}
]

console.log(friends[0]["name"]);
console.log(friends[1]["name"] + " - " + friends[1]["age"]);

console.log(friends[0]["parents"][0]["name"]);
console.log(friends[1]["parents"][0]["name"]);