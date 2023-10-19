import java.util.LinkedList;
public class Basic {
    public static void main(String args[])
    {
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(5);
        ll.addLast(7);
        //2->1->5->7

        System.out.println(ll);

        //remove
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
