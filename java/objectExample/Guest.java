public class Guest {

    // attributes/properties
    String firstName;
    String lastName;
    Integer age;
    Integer year;
    Integer favoriteNumber;
    String favoriteFood;
    Boolean isHappy;
    Boolean doYouLikeAnime;

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

    public Guest(String firstName, String lastName, Integer age,
    Integer year, Integer favoriteNumber,String favoriteFood,
    Boolean isHappy,Boolean doYouLikeAnime){

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.year = year;
        this.favoriteNumber = favoriteNumber;
        this.favoriteFood = favoriteFood;
        this.isHappy = isHappy;
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
 