// Создайте стрелочную функцию, которая бы принимала массив и цифру, 
// возвращала бы элемент массива под этим индексом.

const returnElementArray= (array, numberPosition)=>{
    return array[numberPosition]
}
console.log(returnElementArray(['a','b','c',4,5,6,7,8],2));
