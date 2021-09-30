let shape = document.getElementById('shape');

let posY = document.getElementById('vertical-pos');

let posX = document.getElementById('pos-x');

let size = document.getElementById('size');

let opacity = document.getElementById('opacity');

let specified_shape = document.getElementById('specified-shape');
let btn = document.getElementById('btn');
let transform = document.querySelector('.transform');

let hex_code = document.getElementById('hex-code');

let r = document.getElementById('r-value').value;
let g = document.getElementById('g-value').value;
let b = document.getElementById('b-value').value;
let a = document.getElementById('a-value').value;

let rgba = document.getElementById('rgba');
let rgbaValues = rgba.querySelectorAll('input');

// VERTICAL
posY.addEventListener('change', function () {
    shape.style.top = posY.value + 'px';
});

// HORIZONTAL
posX.addEventListener('change', function () {
    shape.style.left = posX.value + 'px';
});

// SIZE
size.addEventListener('change', function () {
    shape.style.transform = "scale(" + size.value + ", " + size.value + ")";
});

// OPACITY
opacity.addEventListener('change', function () {
    shape.style.opacity = opacity.value;
});

// SHAPE
let shapeValue;
btn.addEventListener('click', function () {
    shapeValue = specified_shape.value;
    transform.classList.add(shapeValue);
});

// HEX
hex_code.onkeydown = function (event) {
    if (event.which === 13) {
        shape.style.backgroundColor = '#' + hex_code.value;
    }
};

// RGBA
rgbaValues.forEach(element => element.addEventListener('change', function () {
    element.style.backgroundColor = `rgba(${r.value}, ${g.value}, ${b.value}, ${a.value})`;
}));