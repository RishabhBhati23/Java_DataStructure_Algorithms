import java.util.*;


public class palindrome{
    public static void main(String args[])
    {
      Scanner sc=new Scanner (System.in);

      int palindrome;
      System.out.println("enter the number--->");

      palindrome=sc.nextInt();

      if(isPalindrome(palindrome))
      {
        System.out.println("number:"+ palindrome +" is a palindrome.");
      }
      else{
        System.out.println("number:"+ palindrome +" is not palindrome.");
      }


    }

    public static boolean isPalindrome(int number){
       int palindrome=number; // copied number into variables....
       int reverse=0;

       while(palindrome!=0)
       {
        int remainder = palindrome % 10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome/10;
       } 
       
       //if number and reverse is equal in java thats means 
       //number is palindrome in java....
       if(number==reverse)
       {
        return true;
       }
       return false;
       
    }
}