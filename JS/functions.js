//find() - Returns the first matching element of an array else undefind if value not found
const array = [5, 12, 8, 130, 44];
const val = array.find((item) => item > 200); //Returns undefind If the value does not exist
console.log(val);

//findIndex - return the index of first element which satisfy the condition otherwise returns -1
// function greaterThan23(element){
//     return element > 13;
// }
const greaterThan23 = (element) => element > 23;
// const indexFound = array.findIndex((i) => i > 23);
const indexFound = array.findIndex(greaterThan23);
console.log(indexFound);

//indexOf - returns the index of given element from the array
console.log(array.indexOf(12)); // 1

//includes() - check if the given element is present in the array
//If yes, returns true else returns false
console.log(array.includes(1308))

//some() - this method calls the callback function ones for each element in the array
//until the callback function returns true
//If it does not find any element matching the condition it returns false
console.log(array.some((i) => i % 10 == 0)); //true