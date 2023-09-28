package org.example;

public class DisplayLongestName {
    public static void main(String[] args) {
        String names[] = {"abc", "bc", "c"};
        System.out.print(longest(names, 3));
    }

    public static String longest(String names[], int n) {
        String name = "";
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (names[i].length() > count) {
                count = names[i].length();
                name = names[i];
            }
        }
        return name;
    }
}
