const $ = document.querySelector.bind(document);
const $$ = document.querySelectorAll.bind(document);

let box = $('.box');
let mainSpace = $('main');
let posXInput = $('#position-x-input');
let posYInput = $('#position-y-input');
let sizeInput = $('#size-input');
let opacityInput = $('#opacity-input');
let shapeInput = $('#shape');
let hexInput = $('#hex-code-input');
let rgbaInputs = $$('.range-input.rgba-input input');

posXInput.addEventListener('input', boxevent => {
    box.style.left = event.target.value/100 * (window.innerWidth - box.offsetWidth) + 'px';
})

posYInput.addEventListener('input', event => {
    box.style.top = event.target.value/100 * (mainSpace.offsetHeight - box.offsetHeight) + 'px';
})

sizeInput.addEventListener('input', event => {
    box.style.width = event.target.value*2 + 'px';
    box.style.height = event.target.value*2 + 'px';
})

opacityInput.addEventListener('input', event => {
    box.style.opacity = event.target.value/100;
})

shapeInput.addEventListener('change', function(event) {
    switch (event.target.value) {
        case 'circle':
            box.classList.remove('rhombus');
            box.classList.add('circle');
            break;
        case 'rhombus':
            box.classList.remove('circle')
            box.classList.add('rhombus');
            break;
        default:
            box.classList.remove('rhombus', 'circle');
            break;
    }
})

hexInput.addEventListener('keyup', event => {
    if(event.keyCode === 13) {
        box.style.backgroundColor = '#' + hexInput.value;
        hexInput.value = '';
    }
})

rgbaInputs.forEach(input => {
    input.addEventListener('input', event => {
        let color = `rgba(
            ${Math.round($('#r-value').value * 2.55)},
            ${Math.round($('#g-value').value * 2.55)},
            ${Math.round($('#b-value').value * 2.55)},
            ${$('#a-value').value/100}
            )`;
        box.style.backgroundColor = color;
        console.log(color);
    }) 
});
