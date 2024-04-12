package S13_Linklist2;

public class S4_double_linklist {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    // ADD
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // REMOVE
    public int removeFirst() {
        if (head == null) {
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;
        head = head.next;
        
        size--;

        if (head == null) {
            // If the list becomes empty after removal, update tail to null
            tail = null;
        } else {
            head.prev = null;
        }

        return val;
    }

    public void reverse()
    {
        Node curr=head;
        Node prev = null;
        Node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }
    // PRINT
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        S4_double_linklist dll = new S4_double_linklist();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println("Size: " + dll.size);

        dll.removeFirst();
        dll.print();
        System.out.println("Size: " + dll.size);

        dll.addFirst(1);
        dll.print();
        dll.reverse();
        dll.print();
    }
}
