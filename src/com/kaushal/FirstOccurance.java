package com.kaushal;
//28. Find the Index of the First Occurrence in a String
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class FirstOccurance {
    public static void main(String[] args) {
        int ans = findIndex("leetcodecowdcowd", "cowd");
        System.out.println("==ANS===>"+ ans);

    }
    static int findIndex(String haystack, String needle){
        int n = haystack.length();
        int m = needle.length();
        if (m == 0) {
            return 0;
        }
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i+j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
    }

