import java.util.List;

public class Party {
    public static void main(String[] args) {



        System.out.println("--------DEFAULT CONSTRUCTOR--------");
        // to get an INSTANCE of class, you must INSTANCIATE it
        Guest guest1 = new Guest();
        guest1.firstName = "Daniel";
        guest1.lastName = "Ribeiro";
        guest1.age = 16;

        System.out.println("guest1 "+guest1);
        System.out.println("guest1 First name: "+ guest1.firstName);
        System.out.println("guest1 Lastname: "+ guest1.lastName);
        System.out.println("guest1 Age: "+ guest1.age);
        guest1.eat("hambuger");

        System.out.println("--------DEFAULT CONSTRUCTOR (AGAIN)--------");
        Guest guest2 = new Guest();
        guest2.firstName = "Nicolas";
        guest2.lastName = "Santos";

        System.out.println("guest2 "+guest2);
        System.out.println("Guest2 firstName:"+ guest2.firstName);
        System.out.println("Guest2 firstName:"+ guest2.lastName);
        System.out.println("Guest2 firstName:"+ guest2.age);
        guest1.eat("Acai");

        System.out.println("------ All ARGS CONSTRUTOR --------");
        Guest guest3 = new Guest("Victoria","Portela",24);

        System.out.println("guest2 "+ guest3);
        System.out.println("guest3 fistName: "+ guest3.firstName);
        System.out.println("guest3 lastName: "+ guest3.lastName);
        System.out.println("guest3  age: "+ guest3.age);
        guest3.eat("Nothing.... because she has HW to do ");

        System.out.println("------ All ARGS CONSTRUTOR TEST --------");
        Guest guest4 = new Guest("Carlos","Santos",17,2002,5,"Mashed potatoes",false,true);

        guest4.fullName("Rocha");
        System.out.println("guest2 "+ guest4);
        System.out.println("guest3 fistName: "+ guest4.firstName);
        System.out.println("guest3 lastName: "+ guest4.lastName);
        System.out.println("guest3  age: "+ guest4.age);
        System.out.println("guest3 year you are born: " + guest4.year);
        System.out.println("guest3 Favorite number: " + guest4.favoriteNumber);
        System.out.println("guest3 Favorite food: " + guest4.favoriteFood);
        System.out.println("Is guest3 happy: " + guest4.isHappy);
        System.out.println("Does guest3 like Anime: " + guest4.doYouLikeAnime);
        guest4.favoriteAnime("Sword art online");
        guest4.eat("Nothing.... because he has coding to do ");
        guest4.guestPassword(123456789);

        List<Guest> guests = List.of(guest1,guest2,guest3,guest4);
        guests.forEach(guest -> {
            System.out.println("The following guest has just walked in..."+ guest.firstName + " " + guest.lastName);
        });
    }
}


