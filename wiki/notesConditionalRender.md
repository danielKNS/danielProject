# Coditional rendering 
* https://reactjs.org/docs/conditional-rendering.html

* in React we can create Multiple components which encapsulate behavior that we need. After that we can render them depending on some conditions or the state of our application. In other words, based on one or several conditions, a component decides which elements it will return. In React, conditional rendering works the same way as the conditions work in JavaScript. We use JavaScript operators to create elements representing the current state, and then React Component update the UI to match them.

* For example :
Consider an example of handling a login/logout button. The login and logout buttons will be separate components. If a user logged in, render the logout component to display the logout button. If a user not logged in, render the login component to display the login button. In React THIS situation is called as conditional rendering.

* You can use variables to store elements. This can help you conditionally render a part of the component while the rest of the output doesn’t change.

# inline conditions :
* While declaring a variable and using an if statement is a fine way to conditionally render a component. But sometimes you might want to use a shorter syntax.

# inline If with Logical && Operators:
* This operator is used from checking the condition.If the condition is TRUE it will return the element RIGHT after &&.But if it is FALSE,React will ignore it and skip it .
* For example if you run the below code, you will not see the alert message BECAUSE the condition is not matching.

("javatpoint" == "JavaTpoint") && alert("This alert will never be shown!") 
.
But if you run the below code, you will see the alert message because the condition is matching.

(10 > 5) && alert('This alert will be shown!')


# Using Inhine if-else Conditional operator 
* The ternary operator is used in cases where two blocks alternate given a certain condition. This operator makes your if-else statement more concise. It takes THREE operands and used as a shortcut for the if statement.
* Another method for conditionally rendering elements inline is to use the JavaScript conditional operator condition ? true : false.

* if the condition is TRUE, the statement will be rendered otherwise if it is False will be rendered.


# Preventing Componets from rendering
* In rare case you might want a component to hide itsself even thought it was rendered by another component.To do this you need to return (null) insted of its render output.

* returning null from components render method does not affect the firing of components lifecyle methods.



what is the differents between the if logical && operatos and if-else conditional operator.

