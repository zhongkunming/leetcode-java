package cn.O24;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode pre = null;

        while (current != null) {
            ListNode temp = current.next;
            current.next = pre;
            pre = current;
            current = temp;
        }
        return pre;
    }


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode listNode = new Solution().reverseList(listNode1);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}