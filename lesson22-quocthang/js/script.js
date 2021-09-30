window.onload = function () {


    let wrap = document.getElementById('wrap');

    // Position Y
    let posY = document.getElementById('pos-y');
    posY.onchange = function () {
        wrap.style.top = posY.value + 'px';
    }

    // Position X
    let posX = document.getElementById('pos-x');
    posX.onchange = function () {
        wrap.style.left = posX.value + 'px';
    }

    // Size
    let size = document.getElementById('size');
    size.onchange = function () {
        let option = shapeType.value;
        if (option === 'square') {
            wrap.style.transform = `rotate(0deg) scale(${size.value})`;
        }

        else if (option === 'circle') {
            wrap.style.borderRadius = '50%';
            wrap.style.transform = `scale(${size.value})`;
        }

        else if (option === 'rhombus') {
            wrap.style.transform = `rotate(45deg) scale(${size.value})`;
        }
    }

    // Opacity
    let opacity = document.getElementById('opacity');
    opacity.onchange = function () {
        wrap.style.opacity = opacity.value;
    }

    // Shape Type
    let shapeType = document.getElementById('type-select');
    let typeOk = document.getElementById('type-ok');
    typeOk.onclick = function () {
        let option = shapeType.value;
        if (option === 'square') {
            wrap.style.transform = `rotate(0deg) scale(${size.value})`;
            wrap.style.borderRadius = '0';
        }

        else if (option === 'circle') {
            wrap.style.borderRadius = '50%';
        }

        else if (option === 'rhombus') {
            wrap.style.transform = `rotate(45deg) scale(${size.value})`;
            wrap.style.borderRadius = '0';
        }
    }

    // Hex
    let hex = document.getElementById('hex');
    hex.onkeypress = function(event) {
        if (event.which === 13) {
            wrap.style.backgroundColor = '#' + hex.value;
        }
    }

    // RGBA
    let red = document.getElementById('r');
    let green = document.getElementById('g');
    let blue = document.getElementById('b');
    let alpha = document.getElementById('a');

    let rgbaContainer = document.getElementById('main__content-rgba');
    let rgbaInput = rgbaContainer.querySelectorAll('input');
        
    for (let i = 0; i < rgbaInput.length; i++) {
        rgbaInput[i].onchange = function() {
            wrap.style.background = `rgba(${red.value}, ${green.value}, ${blue.value}, ${alpha.value}`;
        }
    }
    
}   
