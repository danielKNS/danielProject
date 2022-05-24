
// everything must be inside a class.ALSO to update you need to {javac dataTypes.java then java DataTypes}
// understand to the best capabilities what all these words in the method means ?
// Class is a container fo related funtions(Basically classes organize our code )
class DataTypes{
// 1) The return type of this function is "void"
// 2) "Main" is the entry point to our program.(whenever we execute a java the main function 
// gets called and the code inside will gets executed).
// 3) Classes and methods should have an access modifier(Is a special keyword that determines if other classes and methods in this program
// can access there classes and methods.Like: "public" and "privite")
    public static void main(String[] args) { //Method(When a function belongs to a class its called a "Method".)
        System.out.println("----------Data Types-------- :");

        System.out.println("----Strings----- :");
        
        String string = "i am a string";

        System.out.println(string);

        System.out.println("----Numbers----- :");
        // what is te differents ?
        Number n = 10;
        int number = 12;
    
        System.out.println(n);
        System.out.println(number);
        System.out.println(number + number);

        System.out.println("-----Boolean------ :");

        boolean isHappy = true;
        boolean isSad = false;

        System.out.println(isHappy);
        System.out.println(isSad);

        System.out.println("-----Null------ :");

        String str = null;
        Number something = null;
        Boolean somethingElse = null;

        System.out.println(str);
        System.out.println(something);
        System.out.println(somethingElse);

        System.out.println("-----Array------ :");

        char[] array = {'A','B','C','D'};

        System.out.println(array);

        System.out.println("-----Object------ :");

        Object object = new Object();

        System.out.println(object);
        // how to create a synout all the main data types we learned in TS
        // string * , number * , booleans *, null *, undefined,array * ,objects *
    }

}