package com.my.firstSpringBootService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class FirstSpringBootServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootServiceApplication.class, args);

		Car myCar = new Car("Elandra","Hyndai",2013,"Black");
		System.out.println("myCar " + myCar);

		System.out.println(myCar.getModel());
		myCar.setColor("blue");
		System.out.println(myCar.getColor());

//		System.out.println("Remember do practice here when you come back Daniel!!!!");
//		System.out.println("-------------WELCOME TO PROTECT!!!!!----------");
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("-------Hello User!-------");
//		System.out.println("Please Complete the following:");
//		System.out.println("What is your Name: ");
//		String userName = scanner.nextLine();
//		System.out.println("What is your LastName: ");
//		String userLastName = scanner.nextLine();
//		System.out.println("What is User age: ");
//		Integer userAge = scanner.nextInt();
//		System.out.println("What is User Email: ");
//		String userEmail = scanner.next();
//		System.out.println("User Info : " + "FirstName: " + userName + "LastName: "+ userLastName + " Age: " + userAge + " Email: " + userEmail);
//
//		System.out.println("Does User: " + userName + " want to have extra protection ? ");
//		String userInput = scanner.next();
//		if (userInput.equals("yes")){
//			extraProtection();
//			System.out.println("Thank you for Joining Protect! ");
//		}else {
//			System.out.println("Thank you for Joining Protect! ");
//			System.exit(1);
		}
	}
//	private static void extraProtection(){
//		Scanner extraScanner = new Scanner(System.in);
//		System.out.println("Please pick a 5 digits: ");
//		Integer user5Digits = extraScanner.nextInt();
//		System.out.println("Please pick a favorite color: ");
//		String userFavColor = extraScanner.next();
//		System.out.println("Extra passwords: " + user5Digits + " if User forget the password your KeyWord is :  " + userFavColor);
//		System.out.println("Do you want to Log In ? ");
//		String userExtraInput = extraScanner.next();
//		if (userExtraInput.equals("yes")){
//			logIn();
//		}else {
//			System.out.println("Thank you for Joining Protect! ");
//			System.exit(1);}
//		}

//		private static void logIn(){
//		Scanner logScanner = new Scanner(System.in);
//			System.out.println("Email: ");
//			String userlogEmail = logScanner.nextLine();
//			System.out.println("Password: ");
//			Integer userlogPassword = logScanner.nextInt();
//			if (userlogEmail.equals("danielSkyWork@gmail.com") && userlogPassword == 12345){
//				System.out.println("Welcome Back Daniel ");
//			}else{
//				System.out.println("error");
//			}
//		}
//	}
