const favoriteColor = "white" // assign

if (favoriteColor === "blue") { // scope
    console.log( "its blue")
}
else if (favoriteColor === "red"){
    console.log("its red")
}
else if (favoriteColor === "black"){
    console.log("its black")
}
else {
    console.log("is not an option")
}

console.log(" -----SWITCH STATEMENT-----")

switch(favoriteColor ){
    case "blue": {
        console.log("its blue")
        break
    }
    case "red":{
        console.log("its red")
        break
    }
    case "black":{
        console.log("its black")
        break
    }
    default:{
        console.log("not an option")
    }
}