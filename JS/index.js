//Map Function - Transform every element of the array and returns a new array
const array1 = [1,2,3,5,6];
const res = array1.map((i) => i * 5);
console.log(res);
console.log(array1); //original array stays as it is

//Filter - It Filter down the elements from the array that pass the given condition

const array2 = [5, 7, 8, 90, 12, 34];
const res2 = array2.filter((i) => i > 50);
console.log(res2); // [90]
console.log(array2); //original array stays as it is



//Filter small values in the array
function isBigEnough(value){
    return value > 10;
}
const res3 = [23, 4, 56, 34, 11, 9, 8].filter(isBigEnough);
console.log(res3);
