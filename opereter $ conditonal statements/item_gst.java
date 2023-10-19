import java.util.*;

public class item_gst{
    public static void main(String args[])
    {
        //bill of items
        Scanner sc=new Scanner(System.in);

        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();

        float totel=pencil + pen + eraser;

        System.out.println("bill is:-"+totel);
        //bil + gst

        float newtotel=totel+(0.18f*totel);

        System.out.println("bill With 18% tax :-"+newtotel);
    }
}