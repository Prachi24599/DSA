//Reverse a String
const a = "HelloWorld";
const rev = a.split("").reverse().join("");
console.log(rev);

//Check if string is Palindrome
//madam - we can read same string from forward and backword
const str = "madamm";
const reverse1 = str.split("").reverse().join("");
console.log(str === reverse1); // === check the equality os string

//find the largest number in the array
const numbers = [100, 53, 204, 86];
let large = numbers[0];
for(let i = 0; i < numbers.length; i++){
    if(numbers[i] > large)
        large = numbers[i];
}
console.log("===",large);
//using reduce
const great = numbers.reduce((acc, curr) => {
    if(curr < acc) acc = curr;
    return acc;
}, numbers[0]);
console.log(great)