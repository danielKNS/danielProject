public class Person {
//PRIVATE variables can only be accessed within the same Class.
//However it is possible to access them if we provide public GET and SET methods

    private String name;// privite(restricted access)
    private String lastName;
    private Integer age;

    // ------------- NAME---------------//
    //Getter
    //the GET method returns the varible value
    public String getName(){
        return name;
        
    }

    //Setter
    //the SET method sets the value
    public void setName(String newName){
    // the THIS keyword is used to refer to the current object
        this.name = newName;
        // we are getting the new name and assigning to the name
        //(CHANGING THE CURRENT VALUE)
    }
 //NOTE:Syntax from both is that they start with either GET or SET
 //Followed by the name of varibles,with the first letter in upper case

    // -------------LASTNAME---------------//
    public String getLastName(){
    return lastName;
    
    }

    public void setLastName(String newLastName){
    this.lastName = newLastName;
    }

    // -------------AGE---------------//
    public Integer getAge(){
        return age ;
    } 

    public void setAge(Integer newAge){
        this.age = newAge;
    }


}
