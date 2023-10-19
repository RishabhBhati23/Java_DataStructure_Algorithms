public class LinkedLoop{
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

    public static boolean isCycle(){//floyd algo
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;//+1
            fast = fast.next.next;//+2
            if(slow==fast)
            {
                return true;//cycle exists
            }
        }
        return false;//not exists
    }

    public static void removeCycle()
    {
        //detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
                cycle=true;
                break;
            }
        }

        //find meeting point
        slow = head;
        Node prev = null; //last node
        while(slow != fast)
        {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle - >> last.next =null;
        prev.next = null;



    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        //find mid
        Node mid = getMid(head);
        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public void zigZag() {
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alt merge - zig-zag merge
        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }



    public static void main(String args[])
    {
        LinkedLoop ll = new LinkedLoop();

       //head =new Node(1);
        //Node temp = new Node(2);
       //head.next = temp;
        //head.next.next = new Node(3);
        //head.next.next.next = temp;

        //1->2->3->2.
        //ll.print();
        //System.out.println(isCycle());
        //removeCycle();
        //System.out.println(isCycle());
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        //5->4->3->2->1
        ll.print();


        ll.head=ll.mergeSort(ll.head);

        ll.print();

        ll.zigZag();

        ll.print();





    }
}
