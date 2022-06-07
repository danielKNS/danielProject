class FizzBuzz {
    public static void fizzBuzz() {

        for(Integer number = 1; number <= 16; number++){ // number is starting with 1 and finishes until 16
            if(number % (5*3)== 0){ // if (number % 3 == 0 && number % 5 == 0) if number is division remainder (modulus) to 3 and 5
                System.out.println("FizzBuzz"); 
            }else if(number % 3 == 0){ // if number is division remainder (modulus) to 3
                System.out.println("Fizz");
            }else if(number % 5 == 0){
                System.out.println("Buzz");//if number is division remainder (modulus) to 5
            }else
            System.out.println(number);
     
    }
  }
}


