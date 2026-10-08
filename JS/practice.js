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

//Find Duplicates Elements from the Array
//Approach 1
const arrDup = [1, 2, 3, 2, 4, 5, 1];
function findDuplicate(arr){
    const track = {};
    const repeat = [];
    for(const item of arr){
        track[item] = (track[item] || 0) + 1;
    }
    console.log(track);
    for(const i in track){
        track[i] > 1 && repeat.push(Number(i));
    }
    return repeat;
}
console.log(findDuplicate(arrDup))

//Approach 2 - using set
function findDuplicateUsingSet(arr){
    const seen = new Set();
    const duplicate = new Set();
    for(const i of arr){
        if(seen.has(i)){
            duplicate.add(i);
        }else{
            seen.add(i);
        }
    }
    return [...duplicate];
}
console.log(findDuplicateUsingSet(arrDup));

// Flatten a Nested Array
const nestedArray = [1, [2, [3, 4]], 5];
console.log(typeof([1, [2, [3, 4]], 5])); //object
//So we'll use Array.isArray method to check weather the element is array of not
function flattenNestedArray(arr){
    const flatArr = []
    for(const i of arr){
        if(Array.isArray(i)){
            flatArr.push(...flattenNestedArray(i));
        }else{
            flatArr.push(i);
        }
    }
    return flatArr;
}
console.log(flattenNestedArray(nestedArray));

//using flat() method
console.log("Using Flat", nestedArray.flat(Infinity));

//Using Reduce
function flattenNestedArray(arr) {
  return arr.reduce((result, item) => {
    const flattenedItem = Array.isArray(item)
      ? flattenNestedArray(item)
      : item;
    return result.concat(flattenedItem);
  }, []);
}
console.log("Using Reduce", flattenNestedArray(nestedArray));

//Find Common Elements between 2 Arrays
const a1 = [1, 2, 3, 4, 5, 10, 34, 55];
const a2 = [3, 4, 5, 6, 34, 55];

function findCommon(arr1, arr2){
    const setB = new Set(a2);

    // const comman = arr1.filter((item) => setB.has(item))
    // return [...new Set(comman)];
    return [...new Set(arr1.filter((item) => setB.has(item)))]
}
console.log(findCommon(a1, a2));