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

 function addNumbers(number1, number2 ) { // a function decloration 
     console.log("hello ")
     console.log("number 1 :",number1 )
     console.log("number 2 :", number2)

     const total3 = number1 + number2
     console.log("total:",total3)
}

addNumbers(100, 200)
addNumbers(5, 6)
addNumbers(3, 9)

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
}
subtractNumbers2(2, 4)