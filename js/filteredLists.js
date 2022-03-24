/*
Start with a list of X numbers
1- create me a new list of all even numbers
2- create me another list with all odd numbers
3- create me another list with all even numbers AND numbers that are divisible by 15
4- create me a list where numbers are between 20 and 30 inclusive
5- create me a list where nubmers are between 10 to 20 inclusive OR 30 - 40 inclusive
Expected outputs:
const numbers = [1, ...., 100]
1. [2, 4, 6, ...]
2. [1, 3, 5, ...]
3. [2, 4, 6,.... 15, 16, 18, ...45, 46]
5. [20, 21, ...30]
6. [10, 11,...20, 30, 31, ..., 40]
*/

const numbers = Array(100).fill(0).map((e, i) => i + 1)
console.log("numbers: ", numbers)