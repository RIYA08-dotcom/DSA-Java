/*Leetcode 142-LLCycle2
Time Complexity: O(n)
Space Complexity: O(n)
Approach-(Hashset)
1.First, we will create a HashSet named `set` to store the visited nodes. Then, we will initialize a pointer named `temp` with `head`.
2.Next, we will traverse the linked list using a `while` loop with the condition `temp != null`.
3.Inside the loop, we will check whether the set already contains the current node `temp`. If the node is already present in the set, it means we have visited this node before, so a cycle exists. In that case, we will return `temp`, which is the starting node of the cycle.
4.Otherwise, we will add the current node to the set and move `temp` to the next node using `temp = temp.next`.
5.If `temp` becomes `null`, it means we have reached the end of the linked list without encountering a cycle. Therefore, we will return `null`.
*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode>set=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(set.contains(temp)){
                return temp;
            }
            set.add(temp);
            temp=temp.next;
        }
        return temp;
    }
}
