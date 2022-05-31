public class GetterSetter {
//Encapsulation: is to make sure that "sensitive" data is hidden from the users.If you want to do this you need :
//Declare class variables/Attributes as PRIVITE.
//provide public GET and SET method to access and update the value of a PRIVITE variable. 
    public static void main(String[] args) {
        System.out.println("---------GETTER AND SETTER-------");

        Person obj = new Person();// models = Person
     // the SET method takes a paramenter(newValue) and assigns it to the name variable
        obj.setName("Daniel");
        obj.setLastName("Ribeiro");
        obj.setAge(17);

        //the GET method returns the value of the variable name.
        System.out.println("Person name: " + obj.getName());
        System.out.println("Person Lastname: " + obj.getLastName());
        System.out.println("Person age: " + obj.getAge());

    //NOTE: we use getName() and setName() methods to access and update the variables.     
    }
}
/* 
REASONS TO USE ENCAPSULATION -->
Better control of class attributes and methods.
Class attributes can be made READ-ONLY (if you only use the GET method)
 or WRITE-ONLY (if you only use the SET method).
Flexible: the programmer can change one part of the code without affecting other parts.
Increased security of data.
*/