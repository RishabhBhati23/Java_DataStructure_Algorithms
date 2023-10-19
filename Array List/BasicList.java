import java.util.ArrayList;

public class BasicList{
    public static void main(String args[])
    {
        //list declaration
       ArrayList <Integer> list=new ArrayList<>();
       ArrayList <String> name=new ArrayList<>();
       //add operation
       list.add(5);
       list.add(6);
       list.add(7);
       list.add(0);
       list.add(1,56);

       name.add("RISHABH");
       name.add("kamlesh");
                
       System.out.println(list);
       System.out.println(name);

       //get element
       int element=list.get(3);

       System.out.println(element);
       
       
       //remove element
       name.remove(1);
       System.out.println(name);

       //Set element at index

       list.set(0,55);
       System.out.println(list);

       //contains

       System.out.println(name.contains("RISHABH"));

       System.out.println(list.contains(100));


    }
}