import java.util.List;

public class House {
    public static void main(String[] args) {
        System.out.println("----------------Welcome to my house--------------");

        Room room = new Room(List.of("fdsfsf","fdsfsf","fdsfsf","fdsfsf"));
        // room.setRooms(3);
        // room.setBeds(1);
        // room.setDesks(2);
        // room.setPosters(5);
        // room.setWalls("white");
        // room.setFloors("marble");

        Owners ownerrs = new Owners(List.of("Jack","jack0005@gmail.com",123456));


        System.out.println("The House has: " + ownerrs);
        // System.out.println("For each Room of the House has: " + room.getBeds() + " Bed.");
        // System.out.println("There are only: " + room.getDesks() + " Desks in two rooms.");
        // System.out.println("There are: " + room.getPosters() + " Posters in one Room");
        // System.out.println("The color of the Wall in the House are: " + room.getWalls());
        // System.out.println("The floor of the house are made of: " + room.getFloors());
        
        System.out.println("----------------ROOM 1--------------");
        Room room1 = new Room("Rebecca", 1, 1, 3, "white","marbles");
        // room1.setOwner("Rebecca");
        // room1.setBeds(1);
        // room1.setDesks(1);
        // room1.setPosters(3);
        // room1.setWalls("white");
        // room1.setFloors("marble");

        System.out.println("The owner of the room is: " + room1.getOwner());
        System.out.println("The room has: " + room1.getBeds() + " Bed.");
        System.out.println("There is: " + room1.getDesks() + " Desk");
        System.out.println("There are: " + room1.getPosters() + " Posters");
        System.out.println("The color of the wall is: " + room1.getWalls());
        System.out.println("The floor are made of: " + room1.getFloors());

        System.out.println("----------------ROOM 2--------------");
        Room room2 = new Room("John",1,0,5,"blue","marbles");
        // room2.setOwner("John");
        // room2.setBeds(1);
        // room2.setDesks(0);
        // room2.setPosters(5);
        // room2.setWalls("blue");
        // room2.setFloors("marble");

        System.out.println("The owner of the room is: " + room2.getOwner());
        System.out.println("The room has: " + room2.getBeds() + " Bed.");
        System.out.println("There is: " + room2.getDesks() + " Desk");
        System.out.println("There are: " + room2.getPosters() + " Posters");
        System.out.println("The color of the wall is : " + room2.getWalls());
        System.out.println("The floor are made of: " + room2.getFloors());

    
        System.out.println("----------------ROOM 3--------------");
        Room room3 = new Room("Jack and Oscar",1,0,7,"Black","marble");
        room3.setOwner("Jack and Oscar");
        room3.setBeds(2);
        room3.setDesks(2);
        room3.setPosters(7);
        room3.setWalls("Black");
        room3.setFloors("marble");

        System.out.println("The owner of the room is: " + room3.getOwner());
        System.out.println("The room has: " + room3.getBeds() + " Bed.");
        System.out.println("There is: " + room3.getDesks() + " Desks");
        System.out.println("There are: " + room3.getPosters() + " Posters");
        System.out.println("The color of the wall is : " + room3.getWalls());
        System.out.println("The floor are made of: " + room3.getFloors());

    
        // List<Room> rooms = List.of(room1,room2,room3); 
        // rooms.forEach(room -> {
        //     System.out.println("The following people: " + room.getOwner());
        // });

    }
}
