package cn.O06;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {

    public int[] reversePrint(ListNode head) {
        Deque<Integer> queue = new ArrayDeque<>();
        while (head != null) {
            queue.push(head.val);
            head = head.next;
        }
//        List<Integer> list = new ArrayList<>();
//        while (head != null) {
//            list.add(head.val);
//            head = head.next;
//        }
        int size = queue.size();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
//            arr[i] = list.get(size - i - 1);
            arr[i] = queue.pop();
        }
        return arr;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.reversePrint(l1)));
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
