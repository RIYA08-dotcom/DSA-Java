/*
Leetcode 25
Time Complexity: O(n)
Space Complexity-O(1)
Approach: Iterative Linked List Reversal
1. Initialize `groupStart` to the head of the linked list and `prev` to `null`.
2. Find the kth node (`groupEnd`) from the current group's starting node.
3. If fewer than `k` nodes remain, stop without reversing the remaining nodes.
4. Store `groupEnd.next` in `nextGroup` to preserve the connection to the next group.
5. Reverse the current group using three pointers: `prev`, `curr`, and `next`. Initialize `prev` to `nextGroup` so that the reversed group remains connected to the remaining list.
6. Connect the reversed group to the previous group. If it is the first group, update `head`; otherwise, connect `prev.next` to the new group's head.
7. Move to the next group and repeat until the list ends.
*/
class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode prev = null;
        ListNode groupStart = head;

        while (groupStart != null) {

            // Find the kth node
            ListNode groupEnd = groupStart;

            for (int i = 1; i < k; i++) {

                if (groupEnd == null) {
                    return head;
                }

                groupEnd = groupEnd.next;
            }

            // Less than k nodes remaining
            if (groupEnd == null) {
                break;
            }

            // Save the next group
            ListNode nextGroup = groupEnd.next;

            // Reverse current group
            ListNode newGroupHead = reverse(groupStart, nextGroup);

            // Connect previous group
            if (prev == null) {
                head = newGroupHead;
            } else {
                prev.next = newGroupHead;
            }

            // Old groupStart becomes the last node
            prev = groupStart;

            // Move to next group
            groupStart = nextGroup;
        }

        return head;
    }


    private ListNode reverse(ListNode groupStart, ListNode nextGroup) {

        ListNode prev = nextGroup;
        ListNode curr = groupStart;

        while (curr != nextGroup) {

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
