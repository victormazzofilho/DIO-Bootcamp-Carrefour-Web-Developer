const meuArray = [1, 23, 55, 67, 30, 2, 4];

function filtraPares(arr){
    return arr.filter(callback)
}

function callback(item){ //função externa a função do filter
    return item % 2 === 0; //só lista numeros pares
    //return item % 2 !== 0; //só lista numeros ímpares
}

console.log (filtraPares(meuArray)); //jogamos o array na função filtraPares