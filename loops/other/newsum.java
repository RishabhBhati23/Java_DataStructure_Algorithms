import java.util.Scanner;

public class newsum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int number;
        int choise;
        int evenSum=0;
        int oddSum=0;

        do{
            System.out.println("enter the number-->");
            number=sc.nextInt();
            
            if(number%2==0)
            {
                evenSum+=number;
            }
            else{
                oddSum+=number;
            }

            System.out.println("Do you want to continue for press 1 & do you want to exit press 0.");
            choise=sc.nextInt();
        }while(choise==1);

        System.out.println("the sum of the even number is" + evenSum);
        System.out.println("the sum of the odd number is " + oddSum); 
    }
}