console.log("------First person---------")

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

const getPersonFavoriteSport = (personObject) => { 
    return personObject.favoriteSport  
    
}
const favoriteSport1 = getPersonFavoriteSport(person) 
console.log("Favorite Sport :", favoriteSport1)

const getPersonFavoriteColour = (personObject) => { 
    return personObject.favoriteColour  
    
}
const favoriteColour1 = getPersonFavoriteColour(person) 
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

const favoriteSport2 = getPersonFavoriteSport(person2)
console.log("Favorite Sport :", favoriteSport2)

const favoriteColor2 = getPersonFavoriteSport(person2)
console.log("Favorite Colour", favoriteColor2)

const videoGame2 = getPersonvideoGames(person2)
console.log("Favorite Video Games :", videoGame2)

console.log("------Third Person----------")

const person3 = {  
    firstName: "Samuel",
    lastName: "Alef",
    age: 14,
    isHappy: false,
    favoriteSport: "Soccer",
    favoriteColour: "Red",
    videoGames: ["Minecraft", "Black OPS", "Sonic"],
}
const name3 = getPersonFirstName(person3)
console.log ("Name :", name3)

const lastName3 = getPersonLastName(person3)
console.log ("Last Name :", lastName3)

const Age3 = getPersonAge(person3)
console.log("Age :", Age3)

const isHappy3 = getPersonisHappy(person3)
console.log("Is this person Happy :", isHappy3)

const favoriteSport3 = getPersonFavoriteSport(person3)
console.log ("Favorite Sport :",favoriteSport3)

const favoriteColour3 = getPersonFavoriteSport(person3)
console.log ("Favorite Colour :",favoriteColour3)

const videoGame3 = getPersonvideoGames(person3)
console.log("Favorite Video Games :", videoGame3)

console.log("------CHANGE PERSON INFO---------")

// Function declaration       - receives 2 parameters. - this function is REUSABLE - can be called many times
const setPersonName = (personObject, newFirstName) => {
    personObject.firstName = newFirstName // changed the object field,
    return personObject // returns the changed object
}
const changedPerson1 = setPersonName(person, "Nicolas") 
const changedPerson2 = setPersonName(person2, "Lucas")
const changedPerson3 = setPersonName(person3, "Sasha")

const setPersonLastName = (personObject, newLastName) => {
    personObject.lastName = newLastName
    return personObject 
}
const changedPersonLastName1 = setPersonLastName(person, "Silva")
const changedPersonLastName2 = setPersonLastName(person2, "Vida")
const changedPersonLastName3 = setPersonLastName(person3, "Junior")

const setPersonAge = (personObject, newAge) => {
    personObject.age = newAge
    return personObject 
}
const changedAge1 = setPersonAge (person, 5 )
const changedAge2 = setPersonAge (person2, 21 )
const changedAge3 = setPersonAge (person3, 17 )

const setPersonIsHappy = (personObject, newIsHappy) => {
    personObject.isHappy = newIsHappy
    return personObject 
}
const changedIsHappy1 = setPersonIsHappy (person, false )
const changedIsHappy2 = setPersonIsHappy (person2, false )
const changedIsHappy3 = setPersonIsHappy (person3, true )

const setPersonFavoriteSport = (personObject, newFavoriteSport) => {
    personObject.favoriteSport = newFavoriteSport
    return personObject 
}
const changedFavoriteSport1 = setPersonFavoriteSport (person, "Golf" )
const changedFavoriteSport2 = setPersonFavoriteSport (person2, "Rugby" )
const changedFavoriteSport3 = setPersonFavoriteSport (person3, "VolleyBall" )

const setPersonFavoriteColour = (personObject, newFavoriteColour) => {
    personObject.favoriteColour = newFavoriteColour
    return personObject 
}
const changedAFavoriteColour1 = setPersonFavoriteColour (person, "Purple" )
const changedFavoriteColour2 = setPersonFavoriteColour (person2, "Green" )
const changedFavoriteColour3 = setPersonFavoriteColour (person3, null )

const setPersonVideoGames = (personObject, newVideoGames) => {
    personObject.videoGames = newVideoGames
    return personObject 
}
const changedVideoGames1 = setPersonVideoGames (person, ["Roblox", "Among Us", "Halo"] )
const changedVideoGames2 = setPersonVideoGames (person2, ["Sea of Thieves", "Ark", "Destiny"])
const changedVideoGames3 = setPersonVideoGames (person3, ["Undertale","A Way out","Ghost of Tsushima"] )

console.log("------New update-----")
console.log(changedPerson1)
console.log("-----New update------")
console.log(changedPerson2)
console.log("-----New update-----")
console.log(changedPerson3)