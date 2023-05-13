package LeetCode.findTheIndexOfFirstOccurence;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        if (haystack.contains(needle)) {
            int index = haystack.indexOf(needle);
            return index;
        }
        return -1;
    }
}
