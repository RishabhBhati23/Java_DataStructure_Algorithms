public class Linked1 {
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

    public void addFirst(int data) {
        //size++;
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
        //size++;
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //for iterative search

    //Iterative
    public int itSearch(int key) {
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //for recursive Search
    public int recSearch(int key) {
        return searchHelper(head, key);
    }

    public int searchHelper(Node head, int key) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }

        int idx = searchHelper(head.next, key);
        if(idx == -1) {
            return idx;
        }
        return idx+1;
    }

    //for reverse a lniked list
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthfromEnd(int n) {
        //size
        int size = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }
        //if we have to remove the head
        if(n == size) {
            head = head.next;
            return;
        }

        int i = 1;
        int itf = size-n;
        Node prev = head;
        while(i < itf) { //try to find the node previous of nth
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }


    //check palindrome or not
    private Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head.next;
        //important because we want final mid to be end of 1st half in even case,
        //not start of 2nd half. Because mid.next is start of 2nd half.

        while(fast!= null && fast.next!=null) {
            slow = slow.next;//+1
            fast = fast.next.next;//+2
        }
        return slow;
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }
        //find middle
        Node mid = findMidNode(head);

        //Reverse 2nd half
        Node curr = mid;
        Node prev = null;
        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        //check if equal
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


    public static void main(String args[])
    {
        Linked1 ll = new Linked1();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);

        ll.print();

        //for iterative search
        // Iterative Search
        System.out.println(ll.itSearch(1));
        System.out.println(ll.itSearch(5));

        // Recursive Search
        System.out.println(ll.recSearch(1));
        System.out.println(ll.recSearch(5));

        //for reverse
        ll.reverse();
        ll.print();

        //remove nth node from end

        ll.removeNthfromEnd(3);
        ll.print();

        //check palindrome or not
        //ll.checkPalindrome();
        System.out.println(ll.checkPalindrome());



    }

}
