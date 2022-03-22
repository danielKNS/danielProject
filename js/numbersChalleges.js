// HERE ARE THE CHALLEGENS THAT I NEED TO COMPLETE/

/*Largest and smallest number :

*/
console.log("Largest and smallest number Challenges: ")
console.log ("-------------------------------------")
console.log ("LARGEST NUMBERS")

const numbers = [1, 6, 10, -2, ,0, 56, 0.1]

let largestNumber = numbers[0]
numbers.forEach(number => {
    console.log ("Number : ", number)
    console.log (" ")
    console.log ("The Largest number is : ", largestNumber)
    console.log (" ")
    if (number > largestNumber) {
        console.log ("Number:", number, "is GREATER then : ", largestNumber)
        largestNumber = number
        console.log (" ")
        console.log ("THE BIGGEST NUMBER NOW IS : ",largestNumber)
        console.log (" ")
    }})

console.log ("-------------------------------------")
console.log (" ")
console.log ("SMALLEST NUMBERS")

let smallestNumber = numbers[0]
numbers.forEach(number => {
    console.log ("Number : ", number)
    console.log (" ")
    console.log ("The Smallest number is : ", smallestNumber)
    console.log (" ")
    if (number < smallestNumber) {
        console.log ("Number:", number, "is LESS then : ", smallestNumber)
        smallestNumber = number
        console.log (" ")
        console.log ("THE SMALLEST NUMBER NOW IS : ",smallestNumber)
        console.log (" ")
    }})

    console.log ("The Largest number in the array is :", largestNumber)
    console.log (" ")
    console.log ("The Smallest number in the arrays is :", smallestNumber)


