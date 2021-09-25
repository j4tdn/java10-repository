// NOTE: Splice



// function operate(manipulate) {
//     let a = +prompt('Enter a');
//     let b = +prompt('Enter b');

//     alert('sum: ' + manipulate(a, b));
// }

// operate((a, b) => a + b);

// function greeting(s) {
//     console.log(`Welcome to ${s} to the page`);
// }
// // processUserFromInput(greeting);
// processUserFromInput(name => console.log(`Welcome ${name} to the JS Page`));


// let counter = 0;
// let randItv = setInterval(() => {
//     console.log("Interval: " + Math.random());
//     if (counter++ === 5) {
//         clearInterval(randItv);
//     }

// }, 300);



// let randItv = setTimeout(() => {
//     console.log(`Timeout: ${Math.random * 10}`);
// }, 300);

// global scope
let digit = 8;
let text = 'welcome';

// let, const: block scope {}
// var: function scope{}

function printDigit() {
    console.log(digit);

    for (var i = 0; i < digit; i++) {
        // local - block scope
        console.log(`i >> ` + i);
    }

    console.log(`i36 >> ` + i);
}

function printText() {
    console.log(text);
}

printDigit();
printText();

let months = ['February', 'March', 'April'];
/*
    push(e)    >> add(length-1, e)
    pop()      >> remove(lengeth-1)
    unshift(e) >> add(0, e)
    shift      >> remove(0)
    slice(a,b) >> subList(a,b)
    splice(index, count?) >> remove(idx, count?)
    splice(index, count?, items)
+ count = 0; >> splice(index, 0, items) >> addAll(index, items);
*/
Array.prototype.insert = function (idx, element) {
    this.splice(idx, 0, element);
}