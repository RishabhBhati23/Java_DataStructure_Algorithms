import java.util.*;
import java.util.ArrayList;

public class Max{
    public static void main(String args[])
    {
        ArrayList <Integer> list = new ArrayList<>();

        int max=Integer.MIN_VALUE;

        list.add(1);
        list.add(2);
        list.add(56);
        list.add(4);
        list.add(5);

        System.out.println(list);
        
        for(int i=0 ; i<list.size() ; i++)
        {
            if(max<list.get(i))
            {
               max=list.get(i);
            }
        }

        System.out.println(max);
    }
}