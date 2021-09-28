let name = document.getElementsByName('lorem');
let classNames =  document.getElementsByClassName('past');
let tagNames =  document.getElementsByTagName('p');
let id =  document.getElementById('unique');

let selector = document.querySelector('h1.past');
let selectors = document.querySelectorAll('h1.past');



/*JS CRUD DOM elements*/
// let newTask = document.createElement('li');
// newTask.textContent = 'Task 04: Todo';
// newTask.style.color = 'red';


/*append*/
//let todayTasks = document.getElementById('today-tasks');

//todayTasks.remove

//todayTasks.insertBefore(newTask, todayTasks.children[1]);

 //todayTasks.appendChild(newTask);

 let addBtn = document.querySelector('.add');
 let todayTasks = document.getElementById('today-tasks');
    addBtn.onclick = function () {
 	let newTask = document.createElement('li');
 	newTask.textContent = document.querySelector('task-text').value;
 	newTask.style.color = red;
 	todayTasks.appendChild(newTask);
     
 }