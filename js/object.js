const computer2 = {}// <= this is an object
const person = {
    // key: value
    firstName: "Daniel",
    lastName: "Ribeiro",
    age: 16,
    isHappy: true,
    favoriteSport: null,
    favoriteColour: undefined,
    videoGames: ["Dark souls", "Apex", "Elden Ring"]

}
console.log("person",person)
console.log("firstName", person.firstName)
console.log("lastName",person.lastName)
console.log("age :", person.age)
console.log("Video Games",person.videoGames)
console.log("favoriteSport ",person.favoriteSport)
console.log("favoriteColour ",person.favoriteColour)
const favoriteGames = person.videoGames[2]
console.log("Favorite Video Game :",favoriteGames)

console.log("------ changing values----")

person.favoriteSport = "Volleyball"
console.log ("person ",person)

person.favoriteColour = "black"
console.log("person", person )

console.log("-----------creating new object---------")
const person2 = person 
console.log("person 2",person2)
person2.age = 17 
console.log("person 2",person2)
console.log("person after changing person2", person)

const person3 = {
    ...person, // copy a different object
    firstName: "Gabriel",
    eyeColour: "brown"
}
console.log("person3",person3)
person3.lastName = "Santos" 
console.log("person3",person3)
console.log("person", person)