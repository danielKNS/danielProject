import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Palidromes {
    public static void main(String[] args) {
        String []myList = { "karan", "madam", "tom", "civic", "radar", "sexes", "jimmy", "kayak"
        , "john", "refer", "billy","billy", "did"};
        int myLength = myList.length;

        // Print required answer
        PalindromicStrings(myList, myLength);
    }
    private static ArrayList<String> PalindromicStrings(String []myList, int myLength){
    ArrayList<String> palindromeArray = new ArrayList<String>();
    ArrayList<String> notPalindromeArray = new ArrayList<>();
    // Loop to find palindrome string
    for (int i = 0; i < myLength; i++) {

    // Checking if given string is
    // palindrome or not
    if (isPalindrome(myList[i])) {

        // Update answer variable
        palindromeArray.add(myList[i]);
    }else{
        notPalindromeArray.add(myList[i]);
    }

    }
    System.out.println("Theses are Palindrome: " + palindromeArray);
    System.out.println("Theses are not Palindrome: " + notPalindromeArray);
    return palindromeArray;
  }

  private static boolean isPalindrome(String str){
    // Start from leftmost and rightmost corners of str
    int l = 0;
    int r = str.length() - 1;
 
    // Keep comparing characters while they are same
    while (r > l)
    {
      if (str.charAt(l++) != str.charAt(r--))
      {
        return false;
      }
    }
    return true;
  }

}