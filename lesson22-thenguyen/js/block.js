var block = document.getElementById('block');

var posY = document.getElementById('pos-Y');
posY.onchange = function () {
    block.style.top = posY.value + 'px';
}

var posX = document.getElementById('pos-X');
posX.onchange = function () {
    block.style.left = posX.value + 'px';
}

var size = document.getElementById('size');
size.onchange = function () {
    block.style.transform = `scale(${size.value})`;
}

var opacity = document.getElementById('opacity');
opacity.onchange = function () {
    block.style.opacity = opacity.value;
}

var selectedShape = document.getElementById('shape-selector');
var btnOk = document.getElementById('ok');
btnOk.onclick = () => {
    const optionSelect = selectedShape.value;
    if (optionSelect === 'S1') {
        block.style.transform = 'rotate(0deg)';
        block.style.borderRadius = '0'
    } else if (optionSelect === 'S2') {
        block.style.transform = 'rotate(0deg)';
        block.style.borderRadius = '50%';
    } else if (optionSelect === 'S3') {
        block.style.transform = 'rotate(45deg)';
        block.style.borderRadius = '0';
    }
    console.log(optionSelect)
}

var hex = document.getElementById('hex');
hex.onkeyup = () => {
    block.style.backgroundColor = `#${hex.value}`;

}


var rgbaR = document.getElementById('rgba-r');
var rgbaG = document.getElementById('rgba-g');
var rgbaB = document.getElementById('rgba-b');
var rgbaA = document.getElementById('rgba-a');

const rgbaInput = document.querySelectorAll('.rgba');
console.log(rgbaInput)
for (let i = 0; i < rgbaInput.length; i++) {
    rgbaInput[i].onchange = () => {
        block.style.backgroundColor = `rgba(${rgbaR.value}, ${rgbaG.value}, ${rgbaB.value}, ${rgbaA.value})`
    }
}
