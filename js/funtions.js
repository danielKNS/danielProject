// fuction ; IS A WRAPER THAT YOU CAN USE MULTIPLE TIMES 

 const numb1 = 5
 const numb2 = 10
 const total = numb1 + numb2
 console.log("total :", total)

 const numb3 = 8
 const numb4 = 3
 const total1 = numb3 + numb4 
 console.log("total1 :", total1)

 const numb5 = 7
 const numb6 = 7
 const total2 = numb5 + numb6
 console.log ("total2", total2)

console.log("----- functions-------")

 function addNumbers(number1, number2 ) { // a function declaration 
     console.log("hello ")
     console.log("number 1 :",number1 )
     console.log("number 2 :", number2)

     const total3 = number1 + number2
     console.log("total:",total3)
}

addNumbers(100, 200)
addNumbers(5, 6)
addNumbers(3, 9)

console.log("--- lucas es6 adding -----")

const addNumbers2 = (number1, number2) => {
    console.log("adding number1: ", number1, " to number2", number2)
    return number1 + number2
}
const result1 = addNumbers2(100, 200)
console.log("result1: ", result1)

const result2 = addNumbers2(result1, 6)
console.log("result2: ", result2)

const result3 = addNumbers2(3, result2)
console.log("result3: ", result3)

console.log("-------my one------")

function subtractNumbers(number,number3){
    const total4 = number - number3
    console.log("total4", total4)
}
subtractNumbers(15, 20)
subtractNumbers(7, 8)
subtractNumbers(1, 1)

const subtractNumbers2 = (number1, number2) =>{ 
    console.log("helooooo")
    const total3 = number1 - number2
    console.log("total3 :", total3)
    return total3
}
const total10 = subtractNumbers2(2, 4)
console.log("total10 : ",total10)

