const todoItems = [
    { id: 1, text: "Take out trash and recycling", completed: true},
    { id: 2, text: "Pick up dry cleaning", completed: false},
    { id: 3, text: "Get oil change", completed: false},
    { id: 4, text: "Write thank-you notes", completed: false},
];
console.log("todoItems: ", todoItems)

const mainTodoDiv = document.getElementById("main-todo-list")

console.log("---- DELETING DIV -----")
const deleteDiv = document.getElementsByClassName("todo")[0]
mainTodoDiv.removeChild(deleteDiv)

console.log("---- DISPLAYING TODO ITEMS ---- ")

const handleClick = (event) => {
    const target = event.target
    const checked = target.checked
    const parent  = target.parentElement

    const span = document.getElementById("remaining-count")

    if (checked) {
        parent.className = "todo complete"
        span.innerHTML--
    } else {
        parent.className = "todo"
        span.innerHTML++
    }
 
}

const displayTodoItem = (todoItem) => {
    const div2 = document.createElement('div')
    div2.id = todoItem.id
    div2.className = todoItem.completed === true ? "todo complete" : "todo"

    const input2 = document.createElement('input')
    input2.type = "checkbox"
    input2.className = "todo-checkbox"
    if (todoItem.completed === true) {
        input2.checked = true
    }
    input2.addEventListener("click", handleClick)
    
    const span2 = document.createElement("span")
    span2.className = "todo-text"
    span2.innerHTML = todoItem.text
    
    div2.append(input2)
    div2.append(span2)
    mainTodoDiv.appendChild(div2)
}

todoItems.forEach(todoItem => {
    displayTodoItem(todoItem)
})

console.log("---- MARKING ITEM COMPLETE -----")

console.log("---- ITEMS REMAINING ----")
const uncompletedItems = todoItems.filter(todoItem => todoItem.completed === false)
const itemsRemaining = uncompletedItems.length

const span = document.getElementById("remaining-count")
span.innerHTML = itemsRemaining

console.log("----- ADDING NEW ITEMS -----")
const appDiv = document.getElementsByClassName("app")[0]
console.log("appDiv: ", appDiv)

const input = appDiv.children[2]
console.log("input: ", input)

const handleInput = (event) => {
    const text = event.target.value
    const keyCode = event.keyCode

    if (keyCode === 13) {
        const children = mainTodoDiv.children
        const lastItemId = +children[children.length - 1].id

        const newItem = {
            id: lastItemId + 1, 
            text: text, 
            completed: false
        }
        
        displayTodoItem(newItem)
        input.value = ""
        const currentItemsRemaining = +span.innerHTML
        span.innerHTML = currentItemsRemaining + 1
    }
}

input.addEventListener("keydown", handleInput)