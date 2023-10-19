import java.util.Arrays;

public class anagram{
    public static void main(String args[])
    {
        String str1="earth";
        String str2="heart";

        //convert string to lowercase. why ? so that we dont have to check repeatedaly for lower to uppercase.
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        //first check- if the length are the same

        if(str1.length() == str2.length())
        {
           //convert string into char array
           char[] str1charArray = str1.toCharArray();
           char[] str2charArray = str2.toCharArray();


           //sort the char array

           Arrays.sort(str1charArray);
           Arrays.sort(str2charArray);

           // if the sorted char arrays are the same or identical then the string are anagram


           boolean result = Arrays.equals(str1charArray,str2charArray);
           if(result)
           {
              System.out.println(str1 + "\nand" + str2 + "\nare anagram of each other.");
           }else{
            System.out.println(str1 + "\nand" + str2 + "\nare not anagram to each other.");
           }

        }
        else{
            //this case for length are not equals......
            System.out.println(str1 + "\nand" + str2 + "\nare not anagram to each other.");
        }

          
    }
}

