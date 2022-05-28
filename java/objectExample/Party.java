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

        System.out.println("guest2 "+guest3);
        System.out.println("guest3 fistName: "+ guest3.firstName);
        System.out.println("guest3 lastName: "+ guest3.lastName);
        System.out.println("guest3  age: "+ guest3.age);
        guest1.eat("Nothing.... because she has HW to do ");

        List<Guest> guests = List.of(guest1,guest2,guest3);
        guests.forEach(guest -> {
            System.out.println("The following guest has just walked in..."+ guest.firstName + " " + guest.lastName);
        });
    }
}


