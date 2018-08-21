Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.


public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int ca = 0;
        ListNode node = null;
        ListNode main = new ListNode(0);
        node = main;

        while(l1 != null || l2 != null) {
            int sum = 0;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if(ca != 0) {
                sum += ca;
            }
            int digit = sum % 10;
            ca = sum / 10;
            ListNode newnode = new ListNode(digit);
            node.next = newnode;
            node = newnode;
        }
        if(ca == 1) {
            ListNode newnode = new ListNode(ca);
            node.next = newnode;
            node = newnode;
        }
        return main.next;
    }
}
