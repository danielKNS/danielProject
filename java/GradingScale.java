public class GradingScale {
    public static void gradingScale() {
        // number is starting with 1 and finishes until 100
        for(Integer number = 1; number <= 100 ; number++){ 
            if( number >= 90){ // if number is greater or equals to 90
                System.out.println(" your grade is A : Congrats you got a high score : %s".formatted(number)); 

            }else if(number >= 70 && number <= 79){//else if number is greater then 70 and less then 79
                System.out.println(" your grade is B : Keep the good work!: %s".formatted(number));

            }else if(number >= 60 && number <= 69){//else if number is greater then 60 and less then 69
                System.out.println(" your grade is C : Almost there keep trying : %s".formatted(number)); 

            }else if(number >= 40 && number <= 49){//else if number is greater then 40 and less then 49
                System.out.println(" your grade is D : you need to study more : %s".formatted(number)); 

            }else if(number >= 20 && number <= 29){//else if number is greater then 20 and less then 29
                System.out.println(" your grade is F : WOW man you dont know what is 2+2 ? Really! : %s".formatted(number)); 
            }
            

        }
    }
}
