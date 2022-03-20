// this is a commmets 
// this is another comments

/*

Hello u cannot read  this comment my friend

*/

// copies 


//STRINGS data types
const country = " USA "
const country2 = " Brasil"
const sentence = " hello MY !! "
const flowers = 'sun flower '
const name = "Daniel"
const sentence2 = sentence + country

console.log(sentence2)
console.log(country)
console.log(sentence)
console.log(flowers)

console.log ("hi my name is "+ name + " i live in " + country )

console.log ("........................")

//NUMBERS data types

const number1 = 5
const number2 = 10
const number3 = 15

console.log("number1" , number1)
console.log("number2" , number2)
console.log("number3" , number3)

console.log(number1 + number2 + number3)

console.log("My favorite number is " + number1 )

console.log()

console.log(" math")

// NUMBERS + OPERATORS ( +,-,/,*,<,>,===,<=,>=)

const sumtotal = number1 * number2
console.log("the results to multiply is:", sumtotal)

const sumtotal2 = number3 / number1
console.log("the results to divide is:", sumtotal2)

const sumtotal3 = number1 + number2
console.log("the results to add is:", sumtotal3)

const sumtotal4 = number1 - number2
console.log("the results to take away is:", sumtotal4)

// write to the computer of with number is even or odd:

const oddNumber =[1,3,5,7,9]
const evenNumber =[2,4,6,8,16]

console.log("those here are the even numbers",evenNumber)
console.log("those here are the odd numbers",oddNumber)


// Boonleans  data types

const ishappy = true
const isSad = false

console.log("is happy ", ishappy)
console.log ()
//------if statements---------

console.log("-------if statements----------")

const numb1 = 2
const numb2 = 5
const numb3 = 10
const numb4 = 15
const sentece1 = "hehehe"
const sentece3 = "hehehe"

if (numb1 < numb2) {
  console.log(numb1, "is less then", numb2)
}
if (numb3 > numb2) {
  console.log(numb3 , "is greater then ", numb2)
}
if (numb4 >= numb3){
  console.log(numb4,"is greater or equal then ", numb3)
}
if (numb2 <= numb3){ 
  console.log(numb2,"is less or equal then ", numb3)
}
if (numb3 === numb3) {
  console.log(numb3,"is equal then ", numb3)
}
if (sentece1 === sentece3) {
  console.log(sentece1 , " is the same with " , sentece3)

}

const sec1 = "hello"
const sec2 = "bye "

if (sec1 !== sec2 ){
    console.log( sec1 , "is not the same with ", sec2)
  }


  const nu1 = 10
const numberAsStrind = "10"

if (nu1 == numberAsStrind) {
  console.log("number is equals numberAsStrind")
}
/*ARRAYS  data types
const myName = "hello"
console.log(myName)
const number1 = 2
console.log (number1)

const names = ["samuel","victoria","pablo"]
const names2 = names [1]
console.log(names[2])
*/
const number0 = [1, 2 , 3 , 4 , 5]
number0.forEach (number =>
console.log ("adding 10 to the value: ", number , "which gives me:", number + 10 )
)
