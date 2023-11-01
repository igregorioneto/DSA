package org.example.basic;

public class OddToEven {
    public static void main(String[] args) {
        String s = "9817";
        System.out.println(makeEven(s));
    }

    static String makeEven(String s) {
        char arr[] = s.toCharArray();
        int n = s.length();
        int evenLastIndex = n-1;
        for (int i = 0; i < n; i++) {
            if ((arr[i]-'0') % 2 == 0) {
                evenLastIndex = i;
                if (arr[i] < arr[n - 1])
                    break;
            }
        }
        char temp = arr[n-1];
        arr[n-1] = arr[evenLastIndex];
        arr[evenLastIndex] = temp;
        return new String(arr);
    }
}
