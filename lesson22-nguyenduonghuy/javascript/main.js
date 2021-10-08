const block = document.getElementById('block');

const positionY = document.getElementById('posY');
positionY.onchange = () => {
    block.style.top = positionY.value + 'px';
}

const positionX = document.getElementById('posX');
positionX.onchange = () => {
    block.style.left = positionX.value + 'px';
}

const size = document.getElementById('size')
size.onchange = () => {
    block.style.transform = `scale(${size.value})`;
}

const opacity = document.getElementById('opacity');
opacity.onchange = () =>{
    block.style.opacity = opacity.value;
}

const selectedShape = document.getElementById('shape')
const btnOk = document.getElementById('ok-shape')
btnOk.onclick = () => {
    const optionSelect = selectedShape.value;
    if(optionSelect === 'Square'){
        block.style.transform = 'rotate(0deg)';
        block.style.borderRadius = '0'
    }else if(optionSelect === 'Circle'){
        block.style.transform = 'rotate(0deg)';
        block.style.borderRadius = '50%';
    }else if(optionSelect === 'Rhombus'){
        block.style.transform = 'rotate(45deg)';
        block.style.borderRadius = '0';
    }
    console.log(optionSelect)
}

const hex = document.getElementById('hex');
hex.onkeypress = (e) => {
    if(e.which === 13 ){
        block.style.backgroundColor = `#${hex.value}`;
    }
}


const rgbaR = document.getElementById('rgba-R');
const rgbaG = document.getElementById('rgba-G');
const rgbaB = document.getElementById('rgba-B');
const rgbaA = document.getElementById('rgba-A');

const rgbaInput = document.querySelectorAll('.rgba-input');
console.log(rgbaInput)
for (let i=0; i < rgbaInput.length; i++){
    rgbaInput[i].onchange = () =>{
        block.style.backgroundColor = `rgba(${rgbaR.value}, ${rgbaG.value}, ${rgbaB.value}, ${rgbaA.value})`
    }
}




