# State 
* State is similar to props but it is private and fully controlled by the component. Props ARE immutable (CANNOT BE CHANGED).
* the correct way to use state : setState()
* do NOT modify state directly For example :
// wrong way:
* this.state.comment = "hello";

// the correct way :
this.setState({comment: "hello"});

* note that the onlly place wher you can assign this.state is the constructor

# Lifecycle method

* componentDidMount() {
// runs whenever you component is rendered for the first time
}

* componentWillUnmount() {
// runs whenever the DOM component is removed
}



 if (Hand === "Rock") {
            if(headMessage === "Rock") {
                SetHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, TIE!!`)
            } else if (result === "Paper") {
                SetHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, YOU LOST!!`)
            } else if (result === "Scissors") {
                SetHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, YOU WON!!`)
        }
        else if (headMessage === "Paper"){
            if (result === "Rock") {
                SetHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, YOU WIN!!`)
            } else if (result === "Paper") {
                SetHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, TIE!!`)
            } else if (result === "Scissors") {
                SetHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, YOU LOST!!`)
            } 
        }
        else if (headMessage === "Scissors"){
            if(result === "Rock"){
                SetHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, YOU LOST!!`)
            } else if (result === "Scissors"){
                SetHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, TIE!!`)
            }else if (result === "Paper"){
                SetHeadMessage (`YOU choose, ${Hand} , CPU picked ${result}, YOU WIN!!`)
            }
        }
        }
        }






          if (Hand === result){
            SetMessageColor("green")
            SetHeadMessage(`YOU choose, ${Hand} , CPU picked ${result}, YOU WON!!`)
        }else {
            SetMessageColor("red")
            SetHeadMessage(`YOU choose, ${Hand} , CPU picked ${result}, LOST!!`) 
        }