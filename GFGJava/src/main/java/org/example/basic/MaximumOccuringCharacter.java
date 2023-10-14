package org.example.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MaximumOccuringCharacter {
    public static void main(String[] args) {
        String str = "testsample";
        System.out.println(getMaxOccuringChar(str));
    }

    static char getMaxOccuringChar(String line) {
        int max = Integer.MIN_VALUE;
        char ch = 'z';
        char arr[] = line.toCharArray();
        Arrays.sort(arr);
        int count[] = new int[126];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            if (count[arr[i]] > max) {
                max = count[arr[i]];
                ch = arr[i];
            }
        }
        return ch;
    }
}
