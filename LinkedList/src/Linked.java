

public class Linked {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add first node in linked list
    public void addFirst(int data) {
        size++;
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    //add last node in linked list
    public void addLast(int data) {
        size++;
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    //add in middle in a linked list using idx,data;
    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node temp = head;
        int i = 0;
        while(temp != null) {
            if(i == idx-1) {//add here
                Node newNode = new Node(data);
                //insertion at middle
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
            i++;
        }
    }

    //for print a linked list
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //remove a first and last element

    public int removeFirst() {
        if(size == 0) {
            System.out.println("empty LL");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("empty LL");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node temp = head;
        for(int i=0; i<size-2; i++) {
            temp = temp.next;
        }
        int val = temp.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }




    public static void main(String args[])
    {
        Linked ll= new Linked();

        //Add Nodes
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        //ll.addLast(1);
        ll.print();

        //add middle element
        System.out.println("add element in a middle-->using data & index.");
        ll.add(2,10);
        ll.print();

        //size of list
        System.out.println("size of list is --->");
        System.out.println(ll.size);

        //delete a node
        ll.removeFirst();
        ll.removeLast();
        System.out.println("After deletion a print linked list");
        ll.print();

    }
}
