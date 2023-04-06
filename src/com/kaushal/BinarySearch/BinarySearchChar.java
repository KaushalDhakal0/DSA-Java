package com.kaushal.BinarySearch;

//You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
//There are at least two different characters in letters.
//
//Return the smallest character in letters that is lexicographically greater than target.
// If such a character does not exist, return the first character in letters.



public class BinarySearchChar {

    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j'};
        char target = 'z';
        char result = nextGreatestLetter(letters, target);
        System.out.println("The smallest letter greater than " + target + " is: " + result);
    }

    private static char nextGreatestLetter(char[] letters, char target) {
        if (target >= letters[letters.length - 1]){
            return letters[0];
        }
        int start = 0;
        int end = letters.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (letters[mid] <= target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        //For Ceil char
        return letters[start % letters.length];

    }
}
