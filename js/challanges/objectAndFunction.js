// Create 5 different user objects
//         - each with at least 5 different fields
//         - 1 field must be `age`
//         - 1 field must be `salary`
//         - 1 field must be `favoriteColor
//         - 1 field must be `luckyNumber` // at least one person must have 7
//     Create a function for each of the following problems
//     1. Give me a list of all the users (entire object) who are about to retire (older than 59)
//     2. Give me a list of al the users who are not allowed to drink (younger than 21)
//     3. Give me a list of users that underpaid (anyone who makes less than 30000)
//     4. Tell me the total $ we spend on employee salaries per year (total of all salaries)
//         // output is a number
//     5. Tell me the total amount of people who like the color "red"
//         // output is a number
//     6. Tell me the first (and only) person whose lucky number is 7
//         // output is an object
//     Input for all of them: list of objects (list of users)
//     Output: depends on the ask (list, number, object)
// */

// example:
// const user1 = {
//     name: "lucas",
//     // add required fields like age, salary, favoriteColor, luckyNumber
// }
// add 4 more users

// create 6 functions as mentioned above

// call each function once, passing in your list of users

const user1 = {
    name: "Nicolas",
    lastName: "Silva",
    Age: 20,
    luckyNumber: 7,
    favoriteColor: "Blue",
    favoriteSport: "Tennis",
    salary: 25000,
}

const user2 = {
    name: "Rafael",
    lastName: "Costa",
    Age: 35,
    luckyNumber: 15,
    favoriteColor: "Red",
    favoriteSport: "Soccer",
    salary: 45000 ,
}

const user3 = {
    name: "Jonas",
    lastName: "Coelho",
    Age: 59,
    luckyNumber: 7,
    favoriteColor: "Grey",
    favoriteSport: "Orange",
    salary: 56000,
}

const user4 = {
    name: "Davi",
    lastName: "Rocha",
    Age: 18,
    luckyNumber: 0,
    favoriteColor: "Yellow",
    favoriteSport: "VolleyBall",
    salary: 20000,
}

const user5 = {
    name: "Felipe",
    lastName: "Ribeiro",
    Age: 72,
    luckyNumber: 21,
    favoriteColor:"Black",
    favoriteSport:"Golf",
    salary: 78000,
}

console.log("--------List of Old Users-----------")

const usersList = [user1, user2, user3, user4, user5]

const getOldUsers = (usersObject) => {
    usersList.forEach(users => {
        if (users.Age >= 59) console.log("This User is older or same age  :", users)
    }) 
    return usersObject 
    
}
const usersInfo1 = getOldUsers(usersList) 

console.log("---------List of Young Users----------")

const getyoungUsers = (usersObject) => {
    usersList.forEach(users => {
        if (users.Age <= 21) console.log("This User is younger or same age :", users)
    }) 
    return usersObject 
    
}
const usersInfo2 = getyoungUsers(usersList)

console.log("---------List of Users that are underpaid----------")

const getUserSalary = (usersObject) => {
    usersList.forEach(users => {
        if (users.salary < 30000 ) console.log("This User is Underpaid :", users)
    }) 
    return usersObject 
    
}
const usersInfo3 = getUserSalary(usersList)

// const getUsersTotalSalary = (usersObject) => {
//     usersList.forEach(users => {
//         (users.salary + ) 
//     }) 
//     return usersObject 
    
// }
// const usersInfo4 = getUsersTotalSalary(usersList)



