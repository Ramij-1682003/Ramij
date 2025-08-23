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
    Node tail = null;

    // display all node of a linked list
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
            count += count;
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
        while (temp!=null && i < index - 1) {
            temp = temp.next;
            i++;
        }
        if(temp==null || temp.next==null){
            System.out.println("Invaliv index");
        }
        temp.next = temp.next.next;
        System.out.println("Nodde in index " + index + " deleted");
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
        System.out.println("0.Exit");

        while (true) {
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
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
                case "0":
                    System.out.println("Ended");
                    return;
                default:// exit
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}