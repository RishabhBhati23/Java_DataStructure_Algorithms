import java.util.ArrayList;

public class Size{
    public static void main(String args[])
    {
        ArrayList <Integer> list=new ArrayList<>();

        list.add(20);
        list.add(40);
        list.add(60);
        list.add(80);
        list.add(100);

        System.out.println(list.size());

        //print the arraylist

        for(int i=0;i<list.size();i++)
        {
             System.out.println(list.get(i));
        }
        System.out.println();

        System.out.println(list);

        
    }
}