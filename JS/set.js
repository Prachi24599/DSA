const myset = new Set([1, 3, 44, 2]);
console.log(myset)
myset.add(56);
myset.add(22);
console.log(myset);

console.log(myset.has(44))
let res = 0;
myset.forEach((i) => {
    res += i
})
console.log(res);
console.log(myset.values()); //returns an iterator
console.log(myset.keys());//returns an iterator


//Remove duplicate from an array
function removeDuplicate(arr){
    return [...new Set((arr))]
}
const p = [1, 2, 3, 4, 5, 2, 3, 4];
console.log(removeDuplicate(p));

//spread operator - It expand the array, object and iterator into individual values
//combining array
const first = [1, 2];
const second = [3, 4];
const combine = [...first,...second];
console.log(combine);

//copying object
const user = {name : "Prachi", age : 22};
const updatedUser = {...user, city : "Berlin"}
console.log(updatedUser);

//Passing array values as function
function add(a, b, c){
    return a + b + c;
}
const values = [1, 2, 4];
console.log(add(...values))

console.log(...values);

