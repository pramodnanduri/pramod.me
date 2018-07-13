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
