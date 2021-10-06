'use strict'; // enable strict mode
// strict for variable
// js >> single thread

let x = 20;
console.log('x: ' + x);

function strict() {
    let y = 20;
    console.log('y: ' + y);
}

strict();

// strict for method

// hoisting
doSomething();
function doSomething() {
    console.log('>> doSomething()');
}

console.log('doAnotherThing: ' + doAnotherThing);

// doAnotherThing();
// expression function
var doAnotherThing = function () {
    console.log('>> doAnotherThing()');
}

doAnotherThing();

// JS pass by reference or value
// Primitive >> pass by value
let t = 10;
function modify(input) {
    input = 0;
}

modify(t);
console.log('t: ' + t);

// object
let studentA = {
    name: 'Allain',
    age: 27
}

function modified(input) {
    input.name = 'Mina';
}

modified(studentA);
console.log(studentA);


// JS scopes with let and var
// global >> function >> block

// let >> block scope {}
// var >> function scope

let letA = 11;
var varB = 22;

function scope() {
    var fctProp = 33;
    console.log('letA: ' + letA);
    console.log('varB: ' + varB);

    // nested function
    function nestedFunction() {
        var nestedVar = 44;
        let nestedLet = 55;
        console.log('fctProp: ' + fctProp);
    }

    console.log('nestedVar: ' + nestedVar);
    console.log('nestedLet: ' + nestedLet);

    // block scope if() {...} for(){...}
    if (varB % 2 === 0) {
        var blockVar = 66;
        let blockLet = 77;
    }
    //    console.log('blockVar: ' + blockVar);
    console.log('nestedLet: ' + nestedLet);

}

// IIFE ~ Immediately Invoked Function Expression
(function (text) {
    console.log('>> ' + text);
})('IFFE Function');


let iife = (function (a, b) {
    return a + b;
})(5, 10)

console.log("IFFE: " + iife);