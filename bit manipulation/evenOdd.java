import java.util.*;


public class evenOdd {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}