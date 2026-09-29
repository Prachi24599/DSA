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


//Searching in Array using filter
const fruits = ["apple", "banana", "grapes", "mango", "orange"];
//filter array items based on search criteria
function findSimilar(arr, query){
    // el - each element of the array
    return arr.filter((el) => el.toLowerCase().includes(query.toLowerCase()))
}

console.log(findSimilar(fruits, "ap"));
console.log(findSimilar(fruits, "an")); // ['banana', 'mango', 'orange']

//Reduce function -
//The reduce() method is an iterative method. It runs a "reducer" callback function over all elements in the array,
//in ascending-index order, and accumulates them into a single value
const array = [1, 2, 3, 4];
const result = array.reduce((acc, curr) => acc += curr, 0);
console.log(result);

// Note - The reduce() method does not execute the function for empty array elements.

//Foreach Method - Execute the provided callback function on each element of the array
const myArray2 = [10, 20, 36, 89, 67, 34];
myArray2.forEach((i) => {
    console.log("***", i);
})

const items = ["item1", "item2", "item3"];
const copyItems = [];
// Using simple for
// for(let i = 0; i< items.length; i++){
//     copyItems.push(items[i]);
// }
// console.log(copyItems);

//Using foreach
items.forEach((item) => {
    copyItems.push(item);
})
console.log(items);