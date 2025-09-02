
//singly link list
import java.util.*;

public class Singly_linkelist_create {
    static class Node {
        Integer val;
        Node next;

        // default constructor
        Node() {
            val = null;
            next = null;
        }
        
    }

    // list initialize
    Node head = null;
    // Node tail = null;

    // display all node/elements of a linked list
    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Empty list");
            return;
        }

        System.out.print("List : ");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    // display the size of a linked list
    public void size() {
        if (head == null) {
            System.out.println("List size : 0");
            return;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count = count + 1;
        }
        System.out.println("List size: " + count);
    }

    // inert first
    public void insert_first() {
        int data;
        System.out.print("Enter data:");
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();
        Node newnode = new Node();
        newnode.val = data;
        newnode.next = head;
        head = newnode;
    }

    // insert last
    public void insert_last() {
        int data;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data:");
        data = sc.nextInt();
        Node newnode = new Node();
        newnode.val = data;
        newnode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    // insert middle
    public void insert_middle() {
        int data;
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data:");
        data = sc.nextInt();
        System.out.print("Enter index:");
        index = sc.nextInt();
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        Node newnode = new Node();
        newnode.val = data;
        newnode.next = temp.next;
        temp.next = newnode;
    }

    // delete first
    public void delete_first() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        System.out.println("First node is deleted");
    }

    // delete last
    public void delete_last() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            head = null;
            System.out.println("Delete last node");
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Last node is deleted");
    }

    // delete any
    public void delete_any() {
        int index;
        System.out.print("Enter index:");
        Scanner sc = new Scanner(System.in);
        index = sc.nextInt();
        Node temp = head;
        int i = 0;
        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Invaliv index");
        }
        temp.next = temp.next.next;
        System.out.println("Nodde in index " + index + " deleted");
    }

    // search in linklist
    public int search() {
        System.out.print("Enter val:");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.val == val) {
                System.out.println("Element " + val + " found at index " + i);
            }
            temp = temp.next;
            i++;
        }
        return 0;
    }

    // search using recursion
    public boolean search_recursion_helper(Node temp, int val, int index) {
        if (temp == null) {
            System.out.println(val + " Not found");
            return false;
        }
        if (temp.val == val) {
            System.out.println("Element " + val + " found at index " + index);
            return true;
        }
        return search_recursion_helper(temp.next, val, index + 1);
    }

    public void search_recursion() {
        System.out.print("Enter val: ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        search_recursion_helper(head, val, 0);
    }

    // reverse of a linledlist
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next_node = null;
        while (current != null) {
            next_node = current.next;
            current.next = previous;
            previous = current;
            current = next_node;
        }
        head = previous;
    }

    // check palindrome
    public boolean palindrome() {
        if(head==null && head.next==null) return true;
        
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        Node pre=null;
        Node curr=slow;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        
        Node right=pre;
        Node left=head;
        while(right!=null){
            if(left.val!=right.val) return false;
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Singly_linkelist_create list = new Singly_linkelist_create();

        System.out.println("+------------------------------+");
        System.out.println("|     Singly linked List       |");
        System.out.println("+------------------------------+");
        System.out.println("1.Display\t\t2.Size");
        System.out.println("3.Insert first\t\t4.Delete first");
        System.out.println("5.Insert last\t\t6.Delete last");
        System.out.println("7.Insert any\t\t8.Delete any");
        System.out.println("9.Search an element\t10.Search an element using recursion");
        System.out.println("11.Reverse list\t\t12.Palindrome check.");
        System.out.println("0.Exit");
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your choice: ");
            String choice = sc.next();

            switch (choice) {
                case "1": // display
                    list.display();
                    break;

                case "2": // size
                    list.size();
                    break;

                case "3":// insert first
                    list.insert_first();
                    break;

                case "4": // delete first
                    list.delete_first();
                    break;

                case "5": // insert last
                    list.insert_last();
                    break;

                case "6":// delete last
                    list.delete_last();
                    break;

                case "7":// insert any
                    list.insert_middle();
                    break;

                case "8":// delete any
                    list.delete_any();
                    break;

                case "9":// search an element
                    list.search();
                    break;

                case "10":// search an element using recursion
                    list.search_recursion();
                    break;

                case "11":// reverse a linked list
                    list.reverse();
                    break;

                case "12":// check if the list is palindrome
                    System.out.println( "Is the list palindrome: "+ list.palindrome());
                    break;

                case "0":// to end
                    System.out.println("Ended");
                    return;

                default:// exit
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}