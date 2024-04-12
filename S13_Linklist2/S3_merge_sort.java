package S13_Linklist2;

import java.util.LinkedList;

public class S3_merge_sort {

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
    public void addFirst(int data)
    {
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head=tail=newNode;
            return;
        }

        //step2 - newNode next =head
        newNode.next=head;

        //step3 - head =newNode
        head=newNode;
    }

    public void addLast(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head == null)
        {
            head =tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void add(int idx,int data)
    {
        if(idx==0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx-1)
        {
            temp=temp.next;
            i++;
        }

        //i=idx-1;temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //merge sort
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;

    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    public void print()
    {
        if(head==null)
        {
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //zigzag
    public void zigZag()
    {
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow =slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next =null;
        Node prev =null;
        Node next;

        while(curr != null)
        {
            next=curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }

        Node left =head;
        Node right = prev;
        Node nextL,nextR;

        //alt merge -zig-zag merge
        while(left != null && right !=null)
        {
             nextL=left.next;
             left.next=right;
             nextR=right.next;
             right.next=nextL;

             left =nextL;
             right =nextR;
        }

    }
    public static void main(String[] args) {
        S3_merge_sort ll = new S3_merge_sort();
        //merge sort

        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // // 5->4->3->2->1

        // ll.print();
        // ll.head=ll.mergeSort(ll.head);
        // ll.print();
        // System.out.println();
       

        //zigzag()
        ll.addLast(1); 
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // 5->4->3->2->1

        ll.print();
        ll.zigZag();
        ll.print();
        System.out.println();
    }
}
