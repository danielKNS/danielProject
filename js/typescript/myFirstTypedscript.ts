/**brew install typescriptp
 * yarn create react-app name 
 * Data types:
 * 
 * string
 * number
 * boolean
 * null
 * undefined
 * list/array = [] or Array
 * objects
 */



const myName: string = "lucas" 
const myFavoriteNumber: number = 2
const isHappy: boolean = true
const nullVariable: null = null
const undefinedVarible: undefined = undefined
const favoriteColors: string[] = ["red","black","blue"]
const favoriteNumber: number[] = [1,2,3,4,5,6]
const person: {name:string,age:number,isHappy:boolean} = {
    name:"lucas",
    age:24,
    isHappy:true,
}

const myFunction = (someParameter:string) => {
    console.log("myFuntion- someParamenter",someParameter)
}
myFunction("i am string")

type Color = "blue"|"red"|"white"|"yellow" // not an ENUM
enum Hobby {
    GAMING,VOLLEYBALL,RUNNING,ANIME
}

type Person = {
    firstName:string,
    lastname:string,
    age:number,
    favoriteColor:Color,
    favoriteHobby:Hobby,
    isHungry: boolean ,
    hobbies:Hobby[]
}
const person2: Person = {
    firstName:"daniel",
    lastname:"santos",
    age:12,
    favoriteColor:"blue",
    isHungry: true,
    favoriteHobby:Hobby.GAMING,
    hobbies:[Hobby.ANIME, Hobby.GAMING]
}

console.log("my name is :",myName)
console.log("myFavoriteNumber",myFavoriteNumber)
console.log("isHappy",isHappy)
console.log("nullVariable",nullVariable)
console.log("undefinedVarible",undefinedVarible)
console.log("favoriteColors",favoriteColors)
console.log("favoriteNumber",favoriteNumber)
console.log("person",person)

