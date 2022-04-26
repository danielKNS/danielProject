import React, { useState } from "react"
// show that tied,show which one win or loses, and have the three option
const ImageGame = () => {

    const [headMessage, setHeadMessage ] = useState("")
    const [messageColor , setMessageColor] = useState("blue")

    const handleGameClick = (Hand) =>{  // receiving hand 
        // 2(Math.floor make the decimal become full numbers 1(Math.random set up to create an array of  decimals
        const randomNumber = Math.floor(Math.random() * 3)// 3(multiply how many index we want [0,1,2] then assign to randomnNumber.
        console.log("randomNumber",randomNumber)
        let result = randomNumber // randomNumber assign to result
        if(randomNumber === 0){
            result = "Rock"
        }else if (randomNumber === 1){
            result = "Paper"
        }else if (randomNumber === 2) {
            result = "Scissors"
        }
        console.log("result", result)
        console.log("Hand : ",Hand)
        if (Hand === "Rock") {
            if(result === "Rock") {
                setMessageColor("yellow")
                setHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, TIE!!`) 
                // chaging state because you change state react is triggered to re-render where the variable is being used.
            } else if(result === "Paper") {
                setMessageColor("red")
                setHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, YOU LOST!!`)
            } else if(result === "Scissors") {
                setMessageColor("green")
                setHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, YOU WON!!`)
            }
        } else if(Hand === "Paper"){
            if(result === "Rock") {
                setMessageColor("green")
                setHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, YOU WIN!!`)
            } else if(result === "Paper") {
                setMessageColor("yellow")
                setHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, TIE!!`)
            } else if(result === "Scissors") {
                setMessageColor("red")
                setHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, YOU LOST!!`)
            } 
        } else if(Hand === "Scissors"){
            if(result === "Rock"){
                setMessageColor("red")
                setHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, YOU LOST!!`)
            } else if(result === "Scissors"){
                setMessageColor("yellow")
                setHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, TIE!!`)
            }else if(result === "Paper"){
                setMessageColor("green")
                setHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, YOU WIN!!`)
            }
        }
    }
    // console.log("Headmessage",headMessage)


        return( // action happens
        <div className="intro">
            <h1 style={{color:"yellow"}}> Let the game BEGIN!!</h1>
            <h2 style={{color:"purple"}}> Rock Paper or Scissor :</h2>
            <h3 style={{color:"red"}}> Choose wisely my friend!</h3>
            <div>
                <button onClick={() => handleGameClick("Rock")}>  {/*  anonymous funtion that calls handleGameClick then passes in Rock */}
                    <img width={100} height={150} alt= "ImageGame" src ="ImageRock.webp"></img> 
                    </button>
                    <button onClick={() => handleGameClick("Paper")}> 
                        <img width={100} height={150} alt= "ImageGame" src ="imagePaper.webp"></img> 
                        </button>
                        <button onClick={() => handleGameClick("Scissors")}> 
                        <img width={100} height={150} alt= "ImageGame" src ="ImageScissor.webp"></img> 
                </button>
            </div>
            <div>
                <p style= {{color: "blue"}}>The results :</p>
                    <p style={{
                    display:"flex",
                    justifyContent: "left",
                    color: messageColor,
                    }}>
                    {headMessage}
                    
                </p>
            </div>
        </div>
        
    );
}





export default ImageGame;