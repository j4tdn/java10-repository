let block = document.getElementById('shape_block');

let pos_y = document.getElementById('pos_y');
pos_y.onchange = function(){
    block.style.top = pos_y.value + 'px';
}

let pos_x = document.getElementById('pos_x');
pos_x.onchange = function(){
    block.style.left = pos_x.value + 'px';
}

let opacity = document.getElementById('opacity');
opacity.onchange = function(){
    block.style.opacity = opacity.value;
}

let selectedShape = document.getElementById('shape')
let transf_scale_size = document.getElementById('transf_scale_size')

transf_scale_size.onchange = function(){
    let optionSelect = selectedShape.value;
    if (optionSelect === 'Rhombus') {
        block.style.transform = `rotate(45deg) scale(${transf_scale_size.value})`;
    }else{
        block.style.transform = `scale(${transf_scale_size.value})`;
    }
}

let btn_ok = document.getElementById('btn_ok')

btn_ok.onclick = function(){
    let optionSelect = selectedShape.value;
    if(optionSelect === 'Square'){
        block.style.transform = 'rotate(0deg)';
        block.style.borderRadius = '0'
    }else if(optionSelect === 'Circle'){
        block.style.transform = 'rotate(0deg)';
        block.style.borderRadius = '50%';
    }else{
        block.style.transform = 'rotate(45deg)';
        block.style.borderRadius = '0';
    }
}

let hex = document.getElementById('hex');
hex.onkeypress = function(even){
    if(even.which === 13 ){
        block.style.backgroundColor = `#${hex.value}`;
    }
}


let rgba_R = document.getElementById('rgba_R');
let rgba_G = document.getElementById('rgba_G');
let rgba_B = document.getElementById('rgba_B');
let rgba_A = document.getElementById('rgba_A');
let range_rgba = document.querySelectorAll('.range_rgba');
for (let i=0; i < range_rgba.length; i++){
    range_rgba[i].onchange = function(){
        block.style.backgroundColor = `rgba(${rgba_R.value}, ${rgba_G.value}, ${rgba_B.value}, ${rgba_A.value})`
    }
}




