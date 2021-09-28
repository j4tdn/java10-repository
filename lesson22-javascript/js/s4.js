// JS Selectors
let names = document.getElementsByName('lorem');
let classNames = document.getElementsByClassName('past');
let tagNames = document.getElementsByTagName('h1');
let id = document.getElementById('unique');

let selector = document.querySelector('h1.past');
let selectors = document.querySelectorAll('h1.past');

// let newTask = document.createElement('li');
// newTask.textContent = 'Task 04: To do';
// newTask.classList.add('red-color');


// let todayTasks = document.getElementById('today-tasks');
// REMOVE
// todayTasks.children[1].remove();

// INSERT
// todayTasks.insertBefore(newTask, todayTasks.children[0]);

// APPEND
// todayTasks.appendChild(newTask);

let addBtn = document.querySelector('.add');

let todayTasks = document.getElementById('today-tasks');
let input = document.querySelector('.task-text');

input.onkeypress = function (event) {
    if (event.which === 13) {
        addTask();
    }
}
// addBtn.onclick = function () {
//     addTask();
// }

addBtn.addEventListener('click', function () {
    addTask();
})

addBtn.onmouseover = function () {
    this.style.backgroundColor = 'orange';
}

addBtn.onmouseout = function () {
    this.style.backgroundColor = null;
}

document.addEventListener('click', function (ev) {
    console.log(ev.target);
});

// utility functions
function addTask() {
    let newTask = document.createElement('li');

    newTask.textContent = input.value;
    newTask.style.color = 'red';
    todayTasks.append(newTask);
    input.value = ' ';
}