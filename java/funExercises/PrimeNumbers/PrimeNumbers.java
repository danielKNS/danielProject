import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
     System.out.println("----Description: show all the prime numbers, and NON prime numbers in an array----");
        primeNumebers();
        
    }
    private static ArrayList<Integer> primeNumebers(){
        ArrayList<Integer> prime = new ArrayList<>();
        ArrayList<Integer> notPrime = new ArrayList<>();
            // n is the number that we are checking if is prime or not
        for(Integer n = 1; n <=100;n++){
            Integer c = 0;
            //c is a varible that stores the count of proper divisors
            for(int i = 1;i<= n;i++) 
            //we are looping over the range 1 to n and 
            //incrementing the count if we found a proper divisor
            if(n%i == 0)
            c++;
            if(c==2)
            prime.add(n);
            // System.out.println(n + " is a Prime number");
            else{
            notPrime.add(n);
            }
            //after coming out of the loop, we are checking if the count is 2. There are 
            //only two proper divisors (1 and itself). if yes concluding it as a prime number,
            // else a non-prime number.
        }
        System.out.println("Prime numbers: " + prime);
        System.out.println("-------------------------------");
        System.out.println("Not Prime numbers: " + notPrime);
        return prime;
    }
}

