package cn.O05;

public class Solution {
    public String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                builder.append("%20");
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {

    }
}
