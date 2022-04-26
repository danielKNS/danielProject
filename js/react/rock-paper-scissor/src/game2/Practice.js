import React, { useEffect, useState } from "react";

const Practice = () => {

    const [userChoice, setUserChoise] = useState("")
    const [computerChoice, setComputerChoise] = useState("")
    const [result, setResult] = useState("")
    const [messageColor , SetMessageColor] = useState("blue")
    const choices = ["Rock", "Paper", "Scissors"]


    const handleClick = (value) => {  
        setUserChoise(value)
        computerChoices() 
    }

    const computerChoices = () => {
        const randomChoice = choices[Math.floor(Math.random() * choices.length)]
        setComputerChoise(randomChoice)

    }

    useEffect(() => { // useEffect takes two arguments,The first argument passed to useEffect  and the second argument (which is optional) is an array of dependencies.
    {console.log("useEffect is used")
        switch(userChoice + computerChoice){ 
            case "ScissorsPaper":
            case "RockScissors":
            case "PaperRock":
                SetMessageColor("green")
                setResult("YOU WON")
                break
            case "PaperScissors":
            case "ScissorsRock":
            case "RockPaper":
                SetMessageColor("red")
                setResult("YOU LOST")
                break
            case "RockRock":
            case "PaperPaper":
            case "ScissorsScissors":
                SetMessageColor("yellow")
                setResult("TIE")
                break
        }
    }
    },[computerChoice,userChoice])



    return (
        <div>
            <h1 style = {{backgroundColor: "black", display: "grid" }}>hehe</h1>
            <h1>Practice :</h1>
            <h2> user choice is : {userChoice}</h2>
            <h2> computer choice :{computerChoice}</h2>
            {choices.map((choice, index) => <button
              key={index} onClick={() => handleClick(choice)}>
                {choice}  
            </button>)}

            <h1 style={{
                    display:"flex",
                    justifyContent: "left",
                    color: messageColor,
                }}>
                    {result}
                </h1>
            
        </div> 
    )

}

export default Practice