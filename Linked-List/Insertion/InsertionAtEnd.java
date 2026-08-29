import java .util.*;
class Node{
    int data;
    Node next;
    Node(int value){
        this.data=value;
        this.next=null;
    }
}




public class InsertionAtEnd {
    static Node head;

    public static void end(int data){
      Node temp=head;
        Node newNode=new Node(data);
      //if list is empty
        if(head==null){
            head=newNode;
            return;
        }
      //reaching to the end 
        while(temp.next!=null){
            temp=temp.next;

        }
      //connecting with newNode
        temp.next=newNode;


    }
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
           
        }
        System.out.print("null");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        System.out.print("enter no. of node- ");
        int n=sc. nextInt();
        Node tail=null;
        
        for(int i=0;i<n;i++){
            System.out.print("enter node"+(i+1)+" ");
            int data=sc.nextInt();
            
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
           }
           else{
            tail.next=newNode;
            tail=newNode;
           }
            
        }
        System.out.print("enter newnode to insert at end- ");
        int newno=sc.nextInt();
        end(newno);
        display();
       
    }
    
}
