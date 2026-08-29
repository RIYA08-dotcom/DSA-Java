import java .util.*;
class Node{
    int data;
    Node next;
    Node(int value){
        this.data=value;
        this.next=null;
    }
}



//insertion at beginning
public class insertion {
    static Node head;

    public static void begin(int data){
     
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;


    }
  
  //to display the list
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
        System.out.print("enter newnode to insert- ");
        int newno=sc.nextInt();
        begin(newno);
        display();
       
    }
    
}
