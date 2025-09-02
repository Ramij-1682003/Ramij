public class Merge_short_in_list {
    
    //make Node class
    static class Node {
        Integer val;
        Node next;
        
        //default constructor
        Node() {
            val=null;
            next=null;
        }
    }
    Node head = null; // initilizing the head
    
    //to find middle node
    public Node find_mid(Node head){
        if(head==null){
            return null;
        }
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    //for merge function
    public Node merge(Node left2,Node right2){
        
        Node mergelist=new Node();
        mergelist.val=-1;
        Node temp=mergelist;
        
        while(left2!=null && right2!=null){
            if(left2.val<=right2.val){
                temp.next=left2;
                left2=left2.next;
                temp=temp.next;
            }else{
                temp.next=right2;
                right2=right2.next;
                temp=temp.next;
            }
        }
        while(left2!=null){
            temp.next=left2;
            left2=left2.next;
            temp=temp.next;
        }
        while(right2!=null){
            temp.next=right2;
            right2=right2.next;;
            temp=temp.next;
        }
        return mergelist.next;
    }
    
    // to perform merge short
    public Node merge_short(Node head){  
        
        if(head==null || head.next==null){
            return head;
        }
        
        Node mid=find_mid(head);// assign the nid pointer inn list
        Node left=head;
        Node right= mid.next;
        mid.next=null;

        Node left2=merge_short(left);
        Node right2=merge_short(right);
        
        return merge(left2,right2);
    }

    //to print the list
    public void pint(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp=temp.next;
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        Merge_short_in_list list=new Merge_short_in_list();
        Node node1=new Node();
        node1.val=5;
        Node node2=new Node();
        node2.val=10;
        Node node3=new Node();
        node3.val=1;
        Node node4=new Node();
        node4.val=3;
        Node node5= new Node();
        node5.val=2;

        list.head=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=null;

        Node sort=list.merge_short(node1);
        list.pint(sort);
       
    }
}