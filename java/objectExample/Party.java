import java.util.List;

public class Party {
    public static void main(String[] args) {
    //EACH GUEST IS A DIFFERENTS INSTACES BUT THEY ARE IN THE SAME CLASS/OBJECT


        System.out.println("--------DEFAULT CONSTRUCTOR--------");
        //we are instantiating the Guest class
        // to get an INSTANCE of class, you must INSTANCIATE(new) it
        Guest guest1 = new Guest();//calling the constructor(Guest)
        //^^Datatype of Guest
        guest1.firstName = "Daniel"; // assigned "daniel" to guest1.firstName
        guest1.lastName = "Ribeiro";
        guest1.age = 16;

        System.out.println("guest1 "+guest1);// DIFFERENT INSTANCE
        System.out.println("guest1 First name: "+ guest1.firstName);
        System.out.println("guest1 Lastname: "+ guest1.lastName);
        System.out.println("guest1 Age: "+ guest1.age);
        guest1.eat("hambuger");

        System.out.println("--------DEFAULT CONSTRUCTOR (AGAIN)--------");
        Guest guest2 = new Guest();
        guest2.firstName = "Nicolas";
        guest2.lastName = "Santos";

        System.out.println("guest2 "+guest2);// DIFFERENT INSTANCE
        System.out.println("Guest2 firstName:"+ guest2.firstName);
        System.out.println("Guest2 firstName:"+ guest2.lastName);
        System.out.println("Guest2 firstName:"+ guest2.age);
        guest1.eat("Acai");

        System.out.println("------ All ARGS CONSTRUTOR --------");
        Guest guest3 = new Guest("Victoria","Portela",24);

        System.out.println("guest2 "+ guest3);// DIFFERENT INSTANCE
        System.out.println("guest3 fistName: "+ guest3.firstName);
        System.out.println("guest3 lastName: "+ guest3.lastName);
        System.out.println("guest3  age: "+ guest3.age);
        guest3.eat("Nothing.... because she has HW to do ");

        System.out.println("------ All ARGS CONSTRUTOR TEST --------");
        Guest guest4 = new Guest("Carlos","Santos",17,2002,5,"Mashed potatoes",false,true);

        guest4.fullName("Rocha");
        System.out.println("guest4 "+ guest4);// DIFFERENT INSTANCE
        System.out.println("guest4 fistName: "+ guest4.firstName);
        System.out.println("guest4 lastName: "+ guest4.lastName);
        System.out.println("guest4  age: "+ guest4.age);
        System.out.println("guest4 year you are born: " + guest4.year);
        System.out.println("guest4 Favorite number: " + guest4.favoriteNumber);
        System.out.println("guest4 Favorite food: " + guest4.favoriteFood);
        System.out.println("Is guest4 happy: " + guest4.isHappy);
        System.out.println("Does guest4 like Anime: " + guest4.doYouLikeAnime);
        guest4.favoriteAnime("Sword art online");
        guest4.eat("Nothing.... because he has coding to do ");
        guest4.guestPassword(123456789);

        System.out.println("------ All ARGS CONSTRUTOR TEST AGAIN --------");

        Guest guest5 = new Guest("james","branco",46);
        System.out.println("guest5 "+ guest5);// DIFFERENT INSTANCE
        System.out.println("guest5 fistName: "+ guest5.firstName);
        System.out.println("guest5 lastName: "+ guest5.lastName);
        System.out.println("guest5  age: "+ guest5.age);
        guest5.guestPassword(175438809);

        System.out.println("------ All ARGS CONSTRUTOR TEST AGAIN --------");


        Guest guest6 = new Guest("Bob","Smart",76,false);
        System.out.println("guest6 "+ guest6); // DIFFERENT INSTANCE
        System.out.println("guest6 fistName: "+ guest6.firstName);
        System.out.println("guest6 lastName: "+ guest6.lastName);
        System.out.println("guest6  age: "+ guest6.age);
        System.out.println("Does guest6 like Anime: " + guest6.doYouLikeAnime + " ...He said he never watched cartoons in his life ");
        guest6.guestPassword(15488539);

        System.out.println("------ All ARGS CONSTRUTOR TEST AGAIN --------");


        Guest guest7 = new Guest("Junior","Ribeiro",22,true);
        System.out.println("guest7 "+ guest7);// DIFFERENT INSTANCE
        System.out.println("guest7 fistName: "+ guest7.firstName);
        System.out.println("guest7 lastName: "+ guest7.lastName);
        System.out.println("guest7  age: "+ guest7.age);
        System.out.println("Does guest7 like Anime: " + guest7.doYouLikeAnime);
        guest7.favoriteAnime("Code Geass");
        guest7.eat(" BigMac ");

        System.out.println("------ All ARGS CONSTRUTOR TEST --------");
        Guest guest8 = new Guest("Felip","Coelho",15,2007,96,"Acai",true,true);

        guest8.fullName("Santo");
        System.out.println("guest8 "+ guest8);// DIFFERENT INSTANCE
        System.out.println("guest8 fistName: "+ guest8.firstName);
        System.out.println("guest8 lastName: "+ guest8.lastName);
        System.out.println("guest8  age: "+ guest8.age);
        System.out.println("guest8 year you are born: " + guest8.year);
        System.out.println("guest8 Favorite number: " + guest8.favoriteNumber);
        System.out.println("guest8 Favorite food: " + guest8.favoriteFood);
        System.out.println("Is guest8 happy: " + guest8.isHappy);
        System.out.println("Does guest8 like Anime: " + guest8.doYouLikeAnime);
        guest8.favoriteAnime("Attack on Titan");
        guest8.eat(" Happy meal ");
        guest8.guestPassword(9869541);

        System.out.println("------ All ARGS CONSTRUTOR TEST --------");
        Guest guest9 = new Guest("Samuel","Santo",12,87);

        guest9.fullName("Alef");
        System.out.println("guest9 "+ guest9);// DIFFERENT INSTANCE
        System.out.println("guest9 fistName: "+ guest9.firstName);
        System.out.println("guest9 lastName: "+ guest9.lastName);
        System.out.println("guest9  age: "+ guest9.age);
        System.out.println("guest9 year you are born: " + guest9.year);
        System.out.println("guest9 Favorite number: " + guest9.favoriteNumber);
        guest9.favoriteAnime("Fairy Tail");
        guest9.guestPassword(987861);

        Guest guest10 = new Guest();
        guest10.firstName = "daniee";
        guest10.isHappy = true;


        List<Guest> guests = List.of(guest1,guest2,guest3,guest4,guest5,guest6,guest7,guest8,guest9);
        guests.forEach(guest -> {
            System.out.println("The following guest has just walked in..."+ guest.firstName + " " + guest.lastName);
        });
    }
}


