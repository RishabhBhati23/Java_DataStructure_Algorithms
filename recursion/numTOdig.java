public class numTodig{
    static String digit[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void printDigits(int number)
    {
        //base case
        if(number==0)
        {
          return;
        }
        int lastDigit = number%10;
        printDigits(number/10);
        System.out.println(digit[lastDigit]+" ");

    }
    public static void main(String args[])
    {
      printDigits(1234);
      System.out.println();
    }
}