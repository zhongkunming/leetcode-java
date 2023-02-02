package cn.lc.l09;

import java.util.ArrayDeque;
import java.util.Deque;

public class CQueue {

    Deque<Integer> in;
    Deque<Integer> out;

    public CQueue() {
        in = new ArrayDeque<>();
        out = new ArrayDeque<>();
    }

    public void appendTail(int value) {
        in.push(value);
    }

    public int deleteHead() {
        if (out.isEmpty()) {
            if (in.isEmpty()) {
                return -1;
            }
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        return out.pop();
    }

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();

        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(1);
        cQueue.appendTail(2);
        cQueue.appendTail(3);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }
}
