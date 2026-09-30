//Reverse a String
const a = "HelloWorld";
const rev = a.split("").reverse().join("");
console.log(rev);

//Check if string is Palindrome
//madam - we can read same string from forward and backword
const str = "madamm";
const reverse1 = str.split("").reverse().join("");
console.log(str === reverse1); // === check the equality os string