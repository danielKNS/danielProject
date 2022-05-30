public class Guest {

    // ATTRIBUTES/PROPERTIES
    // information about your object
    // descriptions
    String firstName;
    String lastName;
    Integer age;
    Integer year;
    Integer favoriteNumber;
    String favoriteFood;
    Boolean isHappy;
    Boolean doYouLikeAnime;
    // floating (is not inside of a method)

    // Constructor = creates an Instance of guest class
    // default Constructor
    public Guest(){// takes 0 argumnets
        //return nothing, its just empty objects
    }

    // all args Constructor
    // takes 3 arguments
    public Guest(String firstName, String lastName, Integer age){ 
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    //Args Constructor
    //Takes 8 arguments
    public Guest(String firstName, String lastName, Integer age,
    Integer year, Integer favoriteNumber,String favoriteFood,
    Boolean isHappy,Boolean doYouLikeAnime){
    //this. = is a way fro you to look within a class and it looks for any attributes
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.year = year;
        this.favoriteNumber = favoriteNumber;
        this.favoriteFood = favoriteFood;
        this.isHappy = isHappy;
        this.doYouLikeAnime = doYouLikeAnime;
    }

    public Guest(String firstName, String lastName, Integer age,Boolean doYouLikeAnime){

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.doYouLikeAnime = doYouLikeAnime;

    }

    //Methods = actions
    public void eat(String food){
        System.out.println(this.firstName + " is eating: "+ food);
    }

    public void favoriteAnime(String anime){
        System.out.println(this.firstName + " Favorite anime is: "+ anime);
    }

    public void fullName(String middleName){
        System.out.println("This Guest full name is: " + this.firstName +" "+ middleName +" "+ this.lastName );
    }

    public void guestPassword(Integer password){
        System.out.println(this.firstName +" Passord is: "+ password);
    }
}
 
