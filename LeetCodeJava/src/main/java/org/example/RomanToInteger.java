package org.example;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.print(romanToInt(s));
    }

    public static int romanToInt(String s) {
        char[] array = s.toCharArray();
        int total = 0;
        int sub = 0;
        for (int i = 0; i < array.length; i++) {
            int n1 = romanConverter(String.valueOf(array[i]));
            int n2 = 0;
            if (i + 1 > 0 && i + 1 < array.length) {
                n2 = romanConverter(String.valueOf(array[i + 1]));
            }
            total += n1;
            if ( n1 < n2)  {
                sub += romanConverter(String.valueOf(array[i])) * 2;
            }
        }
        return total - sub;
    }

    public static int romanConverter(String n) {
        switch (n) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            default:
                return 0;
        }
    }
}
