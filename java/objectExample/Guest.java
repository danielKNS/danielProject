public class Guest {

    // attributes/properties
    String firstName;
    String lastName;
    Integer age;

    // Constructor = creates an Instance of guest class
    // default Constructor
    public Guest(){// takes 0 argumnets
        //return nothing, its just empty objects
    }

    // all args Constructor
    public Guest(String firstName, String lastName, Integer age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //Methods = actions
    public void eat(String food){
        System.out.println(this.firstName + " is eating: "+ food);
    }
}
 