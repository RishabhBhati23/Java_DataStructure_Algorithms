public class uppLow{
    public static void main(String args[])
    {
        //convert uppercase to lowercase

        for(char ch='A' ; ch<='Z' ; ch++)
        {
           System.out.println((char)(ch | ' '));
           // prints abcdefghijklmnopqrstuvwxyz
        }
    }
}