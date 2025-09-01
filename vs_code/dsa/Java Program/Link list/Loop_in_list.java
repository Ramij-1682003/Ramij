import java.util.*;

public class Loop_in_list {
    static class Node {
        Integer val;
        Node next;

        Node() {
            val = null;
            next = null;
        }
    }

    Node head = null; // initlizise

    // print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        HashSet<Node> visited = new HashSet<>();
        while (temp != null) {
            if (visited.contains(temp)) {
                System.out.print(" (loop detected at " + temp.val + ")");
                break;
            }
            System.out.print(temp.val + " ");
            visited.add(temp);
            temp = temp.next;
        }
        System.out.println();
    }

    // Check is there any loop in list
    public boolean check_loop() {
        Node slow = head;
        Node fast = head;
        while (head != null && head.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // remove loop from list
    public boolean remove_loop() {
    Node slow = head;
    Node fast = head;
    boolean loopExists=false;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            loopExists = true;
            break;
        }
    }
    if (!loopExists) {
        return false; 
    }
    slow = head;
    if (slow == fast) {
        while (fast.next != slow) {
            fast = fast.next;
        }
    } else {
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
    }
    fast.next = null;

    return true; 
}

    public static void main(String[] args) {
        System.out.println("+------------------------------+");
        System.out.println("|         Loop in List         |");
        System.out.println("+------------------------------+");
        System.out.println("1.Chech any loop in list.\t2.Print list.");
        System.out.println("3.Remove loop.\t\t\t0.Exit.");
        System.out.println("");

        Loop_in_list list = new Loop_in_list(); // create instance

        Node node1 = new Node();
        node1.val = 7;
        Node node2 = new Node();
        node2.val = 11;
        Node node3 = new Node();
        node3.val = 3;
        Node node4 = new Node();
        node4.val = 2;
        Node node5 = new Node();
        node5.val = 9;
        Node node6 = new Node();
        node6.val = 10;
        Node node7 = new Node();
        node7.val = 21;
        Node node8 = new Node();
        node8.val = 5;

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node3;

        list.head = node1;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter choice:");
            String choice = sc.next();
            switch (choice) {

                case "1":// chech loop in list
                    System.out.println("Is the list has loop: " + list.check_loop());
                    break;

                case "2":// print the list
                    list.printList();
                    break;

                case "3":// remove the loop
                    list.remove_loop();
                    break;

                case "0":// exit
                    System.out.println("Ended.");
                    return;

                default:// for any input
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }
}