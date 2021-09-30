const mainBlock = document.getElementById('main-block');

const posY = document.getElementById('pos-y');
posY.onchange = () => {
    mainBlock.style.top = posY.value / 2 + 'px';
}

const posX = document.getElementById('pos-x');
posX.onchange = () => {
    mainBlock.style.left = posX.value + 'px';
}

const size = document.getElementById('size');
size.onchange = () => {
    const optionSelect = shapeType.value;
    if (optionSelect === 'Square') {
        mainBlock.style.transform = `rotate(0deg) scale(${size.value / 10})`;
    } else if (optionSelect === 'Rhombus') {
        mainBlock.style.transform = `rotate(45deg) scale(${size.value / 10})`;
    }
    else if (optionSelect === 'Circle') {
        mainBlock.style.borderRadius = '50%';
        mainBlock.style.transform = `scale(${size.value / 10})`;
    }
}


const opa = document.getElementById('opacity');
opa.onchange = () => {
    mainBlock.style.opacity = opa.value / 10;
}



const shapeType = document.getElementById('shape')
const btnOk = document.getElementById('ok')
btnOk.onclick = () => {
    const optionSelect = shapeType.value;
    if (optionSelect === 'Square') {
        mainBlock.style.transform = `rotate(0deg) scale(${size.value / 10})`;
        mainBlock.style.borderRadius = '0';
    } else if (optionSelect === 'Circle') {
        mainBlock.style.borderRadius = '50%';
    } else if (optionSelect === 'Rhombus') {
        mainBlock.style.transform = `rotate(45deg) scale(${size.value / 10})`;
        mainBlock.style.borderRadius = '0';
    }

}

const hex = document.getElementById('hex');
hex.onkeypress = (e) => {
    if (e.which === 13) {
        mainBlock.style.backgroundColor = `#${hex.value}`;
    }
}


const rgbaR = document.getElementById('rgba-R');
const rgbaG = document.getElementById('rgba-G');
const rgbaB = document.getElementById('rgba-B');
const rgbaA = document.getElementById('rgba-A');

const rgbaInput = document.querySelectorAll('.rgba');
for (let i = 0; i < rgbaInput.length; i++) {
    rgbaInput[i].onchange = () => {
        mainBlock.style.backgroundColor = `rgba(${rgbaR.value}, ${rgbaG.value}, ${rgbaB.value}, ${rgbaA.value / 10})`
    }
}
