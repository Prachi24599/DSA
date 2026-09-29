//find() - Returns the first matching element of an array else undefind if value not found
const array = [50, 12, 8, 130, 44];
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

//every()
console.log(array.every((i) => i % 2 == 0)) //true = because all elements are divisible by 2

//push() - add element at the end of the array
//pop() - remove element from the end of the array
array.push("ABC");
array.push("PQR");
console.log(array);
array.pop();
console.log(array);

//unshift() - add element at the beginning
//shift() - Remove element from the begining
array.unshift("Pinku");
console.log(array);
array.shift();
console.log(array);

//slice() - 
//slice(start)
//slice(start, end) -It exclude the end
//-1, -2 .... Index from Back
const animals = ["ant", "bison", "camel", "duck", "elephant"];
console.log(animals.slice(1, 3)); //["bison", "camel"]
console.log(animals.slice(2)); //[ 'camel', 'duck', 'elephant' ]
console.log(animals.slice(2, -1)); // 'camel', 'duck' ]


// splice() method of array changes the content inside the array by 
// REMOVING AND/OR REPLACING the existing values of array AND/OR ADDING
// 3 ways
// splice(start) - Remove all the element starting from given index
// splice(start, deleteCount) - delete the deleteCount number of element from start position
// splice(start, deleteCount, item1...) - same as above but we add new elements as well
const months = ["Jan", "abc", "March", "April", "June"];
const ans = months.splice(4, 0, "May") // [] - It removed 0 element so this array will be empty
console.log(months, "===", ans);
const replace = months.splice(1, 1, "Feb");
console.log(months, "===", replace);
//remove all from given index
const removeAll = months.splice(3);
console.log(months, "===", removeAll);
