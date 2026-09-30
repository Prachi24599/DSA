//Find the Second Largest Number in the Array
let arr = [10, 5, 20, 8];
console.log(arr.sort()); //It wont work
//sort method by default consider elements as string
const months = ["March", "Jan", "Feb", "Dec"];
months.sort(); 
console.log(months);

function compare(a, b){
    return a - b;
    //+ve number a after b  -> Swap the numbers
    //-ve number a before b -> Keep it as it is 
    //zero - both numbers are same
}
// arr.sort(compare);
arr.sort((a, b) => a - b)
console.log(arr);

//If we want to sort descending then do b-a
//second largest element
console.log(arr.length);
console.log(arr[arr.length - 2])