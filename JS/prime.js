
//Find the Prime number in the array
//Prime numbers are the nums which are divisible by 1 and that number itself
//Filter expect us to return truthy or falsy values, so we dont need to return the actual value
// function isPrime(num){
//     if(num < 2) return false;
    
//     let count = 0;
//     for(let i = 2; i <= num; i++){
//         if(num % i === 0)
//             count++;
//     }

//     return count === 1;
// }

//Optimized Version to find the prime numbers
//We can run the loop to check divisibility by sqrt(n)

function isPrime(num){
    if(num < 2) return false;
    
    let count = 0;
    for(let i = 2; i <= Math.sqrt(num); i++){
        if(num % i === 0)
            return false;
    }

    return true;
}
const myArray = [2, 3, 5, 7, 11, 13];
console.log(myArray.filter(isPrime))

//Why does that work with Sqrt(num) =>
//Factors always come in pairs. If a number has a factor greater than its square root, 
// its paired factor must be smaller than the square root. 
// Therefore, checking divisors only up to √n is sufficient.


