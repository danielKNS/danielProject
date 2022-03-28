const person = {
    firstName: "Daniel",
    lastName: "Ribeiro",
    age: 16,
    isHappy: true,
    favoriteSport: "VolleyBall",
    favoriteColour: undefined,
    videoGames: ["Dark souls", "Apex", "Elden Ring"],
}

const getPersonFirstName = (personObject) => { // 1) you have a funtions getPersonFirstName it takes in the a single paramenter
    return personObject.firstName  // 3) then we return here and read what is inside get the personObject.firstName and RETURN IT
    
 }
const name1 = getPersonFirstName(person) //  2) we CALL the fuction getPersonFirstName PASSING  into it a 'person'
console.log("name :", name1)  // 4) then now the return value from factions call to name1


const getPersonLastName = (personObject) => { 
    return personObject.lastName  
    
 }
const lastName1 = getPersonLastName(person) 
console.log("Last Name :", lastName1)


const getPersonAge = (personObject) => { 
    return personObject.age  
    
 }
const Age1 = getPersonAge(person) 
console.log("Age :", Age1)

const getPersonisHappy = (personObject) => { 
    return personObject.isHappy  
    
 }
const isHappy1 = getPersonisHappy(person) 
console.log("is this person Happy :", isHappy1)

const getPersonfavoriteSport = (personObject) => { 
    return personObject.favoriteSport  
    
 }
const favoriteSport1 = getPersonfavoriteSport(person) 
console.log("Favorite Sport :", favoriteSport1)

const getPersonfavoriteColor = (personObject) => { 
    return personObject.favoriteColour  
    
 }
const favoriteColour1 = getPersonfavoriteColor(person) 
console.log("Favorite Colour :", favoriteColour1)

const getPersonvideoGames = (personObject) => {
    return personObject.videoGames
}
const videoGame1 = getPersonvideoGames(person)
console.log("Favorite Video Games :", videoGame1)


console.log("-------Second Person---------")

const person2 = {  
    firstName: "Pedro",
    lastName: "Santos",
    age: 18,
    isHappy: true,
    favoriteSport: "Basketball",
    favoriteColour: "Orange",
    videoGames: ["Mobile legends", "Fortnite", "Sifu"],
}
const name2 = getPersonFirstName(person2)
console.log ("Name :", name2)

const lastName2 = getPersonLastName(person2)
console.log ("Last Name :", lastName2)

const Age2 = getPersonAge(person2)
console.log("Age :", Age2)

const isHappy2 = getPersonisHappy(person2)
console.log ("Is this person happy :", isHappy2)

const favoriteSport2 = getPersonfavoriteSport(person2)
console.log("Favorite Sport :", favoriteSport2)

const favoriteColor2 = getPersonfavoriteColor(person2)
console.log("Favorite Colour", favoriteColor2)

const videoGame2 = getPersonvideoGames(person2)
console.log("Favorite Video Games :", videoGame2)
