import java.util.*;


public class swap{
    public static void main(String args[])
    {
        int x=3;
        int y=4;

        System.out.println("before swap\n"+x+" "+y);

        x=x^y;
        y=x^y;
        x=x^y;

        System.out.println("After Swap\n" + x + " " + y);
    }
}