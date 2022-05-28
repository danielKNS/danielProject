public class Objects {
     // Create a class attribute
    int x; 

    //Create a class Constructor for "Main" Class.
    public Object(){ 
        x=5; // set the initial value for the class attribute.
    }

    public static void object(String[] args){
        Object myobj = new Object(); // Create an object of Class "Main" (this will call the Constructor)
        System.out.println(myobj); // Print the value x

    }
    
}
// Notes:
/*
1* A Constructor is a special method that is used to initialize objects.
 2* The Contructor is called when an object of a class is created.(Note:the constructor name must match the class name, and cannot return type like "void")
 3* It can be used to set initial values for objects attributes.
 4* All classes have Constructor by default if you do not create a class Constructor youself,java create one for you.
 However then you are not able to set initial values for objects attributes.
*/
