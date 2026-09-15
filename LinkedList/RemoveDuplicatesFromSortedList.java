/* Leetcode(82)-Remove Duplicates From Sorted List
Time Complexity-O(n)
Space Complexity-O(1)
Approach:-
1.This problem can be solved without using slow and fast pointers.
2.First, create a dummy node and maintain two pointers: prev and curr.
3.While curr != null && curr.next != null, check whether curr.val is equal to curr.next.val.
4.If a duplicate is found, store the duplicate value and keep moving curr forward until the value changes. This skips the entire group of duplicate nodes.
5.Then connect prev.next to curr to remove all occurrences of that duplicate value.
6.If there is no duplicate, simply move both pointers forward.
7.This approach ensures that no duplicate value remains in the final linked list.



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null && curr.next != null) {

            if (curr.val == curr.next.val) {

                int duplicate = curr.val;

                while (curr != null && curr.val == duplicate) {
                    curr = curr.next;
                }

                prev.next = curr;

            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}
