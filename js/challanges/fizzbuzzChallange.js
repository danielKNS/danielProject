/* Fizz buzz Challenge.

Take a list with numbers, in numerical order (ex: 1- 100)
whenever a number is not divisble by 3 or 5, print out the number
whenever a number is divisble by 3, we want to print out the word "Fizz"
whenever a number is divisble by 5, we want to print out the word "Buzz"
whenever a number is divisble by both 3 and 5, we want to print out the word "FizzBuzz"

REMEMBER THAT DIVISIBLE IS A NUMBER THAT IS CAPABLE TO BE DIVIDED.
*/
console.log (" -------for loop --------")
const fizzBuzz = (numbers) => {
    for (let n = 1; n <= numbers ; n++ ) {
        if (n % 3 === 0 && n % 5 === 0) console.log ("FizzBuzz")
        else if (n % 3 === 0) console.log ("Fizz")
        else if (n % 5 === 0) console.log ("Buzz")
        else console.log (n)
    }
}

console.log(fizzBuzz(100))

console.log ("-----forEach loop------")
const fizzBuzzArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
fizzBuzzArray.forEach((n) => {
    if (n % 3 === 0 && n % 5 === 0) {
        console.log ("FizzBuzz")
    } 
    else if (n % 3 === 0) {
        console.log ("Fizz")
    } 
    else if (n % 5 === 0) {
        console.log ("Buzz")
    }
    else {
        console.log(n)
    }
})