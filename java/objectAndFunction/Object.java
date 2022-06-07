import java.util.List;

public class Object{

   private String firstName;
   private String lastName;
   private Integer age;
   private Integer luckyNumber;
   private String favoriteColor;
   private String favoriteSport;
   private Integer salary;
   private List<Owner> owners;

    public Object(String firstName, String lastName,Integer age,Integer luckyNumber,
    String favoriteColor,String favoriteSport,Integer salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.luckyNumber = luckyNumber;
        this.favoriteColor = favoriteColor;
        this.favoriteSport = favoriteSport;
        this.salary = salary;
        // this.owners = owners;


    }
     // -------------FirstName---------------//
     public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    // -------------LastName---------------//
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    // -------------Age---------------//
    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    // -------------LuckyNumber---------------//
    public Integer getLuckyNumber(){
        return luckyNumber;
    }

    public void setLuckyNumber(Integer luckyNumber){
        this.luckyNumber = luckyNumber;
    } 

    // -------------FavoriteColor---------------//
    public String getFavoriteColor(){
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor){
        this.favoriteColor = favoriteColor;
    } 

    // -------------FavoriteSport---------------//
    public String getFavoriteSport(){
        return favoriteSport;
    }

    public void setFavoriteSport(String favoriteSport){
        this.favoriteSport = favoriteSport;
    } 

    // -------------Salary---------------//
    public Integer getSalary(){
        return salary;
    }

    public void setSalary(Integer salary){
        this.salary = salary;
    } 

    public String toString(){ // toString Method.
        return  "Users: " + owners;
    };


}

