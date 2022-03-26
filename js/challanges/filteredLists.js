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

const emptyArrayOf100 = Array(100)
console.log("emptyArrayOf100 :",emptyArrayOf100)
const  fillNumbers = emptyArrayOf100.fill(0)
console.log("fillNumbers :", fillNumbers)
const numbers = fillNumbers.map((number,index)=> {
    console.log("number and index",number , index) 
    return index + 1
})


// .fill(0).map((e, i) => i + 1)
console.log("numbers: ", numbers)
const evenNumber = numbers.filter(n => n % 2 === 0)
console.log ("Even Numbers : ",evenNumber )

const evenNumber2 = numbers.filter(number => {
    if (number % 2 === 0){
     console.log(" is divisible by 2", number )
     return number 
    }
})
console.log("even number 2 :", evenNumber2)


const oddNumber = numbers.filter(n => n % 2 === 1)

console.log ("odd Numbers : ",oddNumber)
/*
const even_divisible = numbers.filter(n => n % 15 === 0)  && numbers.filter(n => n % 2 === 0)

console.log ("Even Numbers and Numbers that are divisible by 15 : ",even_divisible)
*/
  
const even_divisible = numbers.filter(n => n % 2 === 0 || n % 15 === 0)

console.log ("Even Numbers and Numbers that are divisible by 15 : ",even_divisible)

const betweenNumbers = numbers.filter(numbers => numbers >= 20 && numbers <= 30)

console.log ("betweenNumbers 20 to 30 : ",betweenNumbers)

const betweenNumbers2 = numbers.filter (numbers => numbers >= 10 && numbers <= 20 || numbers >= 30 && numbers <= 40)

console.log ("betweenNumbers 10 to 20 , 30 to  40 : ",betweenNumbers2)