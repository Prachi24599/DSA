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

//Find second largest element in the array without sorting
let arr2 = [11, 52, 20, 8];
let largest = -Infinity;
let secondLargest = -Infinity;

for(const number of arr2){
    if(number > largest){
        secondLargest = largest;
        largest = number;
    }else if(number > secondLargest && number < largest){
        secondLargest = number
    }
}
console.log(secondLargest)

//Count Frequency of Elements into array
const fruits = [ "apple", "banana", "apple", "orange", "banana", "apple" ]
//use an object as a frequency map
//Each Items becomes a key and It's Occurrence count is Incremented
function countFrequency(arr){
    const frequency = {};
    for(const item of arr){
        // if(frequency[item])
        //     frequency[item] = frequency[item] + 1;
        // else
        //     frequency[item] = 1

        frequency[item] = (frequency[item] || 0) + 1;
    }
    return frequency;
}

console.log(countFrequency(fruits));


//Find the Missing Number From the Array 
//This assumes the array contains numbers from 1 through n with exactly one missing.
const myarray = [1, 2, 3, 5, 6];
function findMissing(arr){
    const n = arr.length + 1;
    console.log("n", n)
    const expectedSum = (n * (n + 1)) / 2;
    console.log("expected", expectedSum)

    const actualSum = arr.reduce((acc, curr) => acc += curr, 0)
    console.log("actual", actualSum)
    return expectedSum - actualSum;
}
console.log(findMissing(myarray));