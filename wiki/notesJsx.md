# JSX , COMPONETS AND PROPS :
* Its important that you cannot render more than 1 jsx element at the line
For example <h1></h1> and <p></p> having these elements seperate is not allowed
however if you use  <div></div> its allowed like =>
 (<div>
<h1> hellow world </h1>
</div>)

* user-defined Componets must be Capatalized 
* props are set to true BY default
* Spread attributes

# Componets and Props
https://reactjs.org/docs/components-and-props.html

* Componets can be used more than Once 
* Components are like JavaScript functions. They accept arbitrary inputs (called “props”) and return React elements describing what should appear on the screen

* Componets let you split the UI into independent, reusable pieces, and think about each piece in isolation
*  Lets you focus on ONE thing AT a time

* ALWAYS write componets names with capital letter, react treats components with lowercase letter as DOM tags
THIS is <div /> is an html tag
THIS is <welcome /> is an component

* If something is gonna be reused multiple times like a comment, or an avatar etc. It should be COMPONENT so it is EASIER to reuse.
* If it is complicated like Feedstory,commet or an app its is LIKELY it should be its OWN COMPONENT.
