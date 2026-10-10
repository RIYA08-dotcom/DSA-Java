/*
Leetcode-142
Time Complexity-O(n)
Space Complexity-O(1)
Approach: Floyd's Cycle Detection Algorithm
1. First, initialize two pointers, `slow` and `fast`, both pointing to the `head` of the linked list.
2. Traverse the linked list using a `while` loop with the condition `fast != null && fast.next != null`. In each iteration, move the `slow` pointer one step forward and the `fast` pointer two steps forward.
3. If `slow == fast`, it means that a cycle exists in the linked list. However, this meeting point is not necessarily the starting node of the cycle.
4. After the first loop, check whether `fast == null || fast.next == null`. If this condition is true, the linked list does not contain a cycle, so return `null`.
5. If a cycle exists, initialize another pointer, `helper`, at the `head` of the linked list.
6. Traverse the linked list using another `while` loop with the condition `slow != helper`. In each iteration, move both `slow` and `helper` one step forward.
7. When `slow == helper`, both pointers meet at the starting node of the cycle. Return that node.

  */
  
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return null;
        }
        ListNode helper=head;
        while(slow!=helper){
            slow=slow.next;
            helper=helper.next;
            
        }
        return slow;

    }
}
