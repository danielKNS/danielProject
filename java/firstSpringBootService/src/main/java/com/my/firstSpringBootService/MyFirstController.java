package com.my.firstSpringBootService;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class MyFirstController {
    //endpoint/API
    //request
    //GET = retrieve data
    //POST = create data
    //The GET method requests a representation of the specified resource.
    // Requests using GET should only retrieve data.
    @GetMapping("/")
    public  void sayHelloWorld(){
        System.out.println("hello world from my first Controller!!!!");
    }
    @GetMapping("/hello")
    public String getHelloWorld(){
        System.out.println("this is /hello API ");
        return "hello world from getHelloWorld";
    }

    @GetMapping("/this-is-my-awesome/url/that-i/made-up/in-2022")
    public String crazyAPI(){
        System.out.println("this is crazy");
        return "this is crazy bro!!!!!!";
    }

    @GetMapping("/dude")
    public String dude(){
        System.out.println("bro chill....");
        return "bro you gotta relax a little bit come one bro chill out";
    }
    @GetMapping("/nerf")
    public Integer getNerfBullets(){
        Integer danielBullets = 50;
        Integer mikeBullets = 2578;
        Integer  total = 0;
        total = (danielBullets > mikeBullets) ? danielBullets : mikeBullets;
        System.out.println("OMG Micheal why do you have do many bullets");
        return  total;
    }
    @GetMapping("/fruitOrVegetables")
    public Boolean getFruitOrVegetables(){
        Boolean isTomatoesAVegetables = false;
        System.out.println("NO tomatoes are Fruits ");
        return isTomatoesAVegetables;
    }

    @GetMapping("/listMyCars")
    public List<Car> listOfCar() {
        System.out.println("List of Cars: ");
//        Car car1 = new Car("Elandra", "Hyndai", 2013, "Black");
//        Car car2 =  new Car("Elandra", "Hyndai", 2020, "Red");
//        List<Car> cars = List.of(car1,car2);
//        return  cars;
        return Arrays.asList(
                new Car("Elandra", "Hyndai", 2013, "Black"),
                new Car("Elandra", "Hyndai", 2020, "Red")
        );
    }

    @GetMapping("/myCar")
    public Car myCar() {
        System.out.println("List of Cars: ");
        return  new Car("Elandra", "Hyndai", 2013, "Black");
    }

    @GetMapping("/myNameIs/{Daniel}")
    public String myNameIs(@PathVariable("Daniel")String name ){
        System.out.println("getting name: " + name);
        name = "Daniel";
        return "Sup " + name  ;
    }

//    @GetMapping("/myName")
//    public String myName(@RequestParam(name = "Daniel",required = false , defaultValue = "Rocha") String name){
//        return "hello " + name;
//    }

    //The POST method submits an entity to the specified resource,
    // often causing a change in state or side effects on the server.
    @PostMapping("/cookie")
    public void createCookie(){
        System.out.println("i want a Cookie");
    }

    @PostMapping("/myAge")
    public Integer myAge(){
        Integer age = 17;
        System.out.println("i wanna be young....");
        return age;
    }

    @PostMapping("/names")
    public String names(){
        String name1 = "Nicolas";
        String name2 = "Pedro";
        String name3 = "Rafa" ;

        System.out.println(name1 + " ," + name2 + " and "+ name3 + " What are you guys DOING!!!!!");
        return "The names are: " + name1 + " ," + name2 + " , " + name3;
    }

    @PostMapping("/isItTrue")
    public Boolean thisIsTrue(){
        System.out.println("Yes you are a wonderfull person even tho you are annoying some times ");
        return true;
    }

    @PostMapping("/myFavoriteNumber")
    public Integer myFavNumber(){
        Integer favoriteNumber = 5;
        System.out.println("My favorite number is " + favoriteNumber);
        return favoriteNumber;
    }

    //@RequestBody annotation allows us to retrieve the requests body.We can then return it as a String or other.
    @PostMapping("/request")
    public String  postBody(@RequestBody String fullName){
        System.out.println(fullName);
        return "Hello " + fullName;
    }
    //i am passing through the postman to intelliJ
}
