/*
Leetcode 19
TC-O(n)
SC-O(1)
Approach:
1.First calculate the lenth of the given LL.
2.To get the position from starting subtract n from length.
3.traverse the LL till position.
4.connect the previous node  from position to the next's next node.
5.return head to get the LL from start.

*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int pos=length-n;
       
        if(pos==0){
            return head.next;
        }
         temp=head;
        for(int i=1;i<pos;i++){//for(int i=0;i<pos-1;i++)
            temp=temp.next;
        }
      
        
        temp.next=temp.next.next;
        //to get the list from starting
        return head;

        
    }
}
