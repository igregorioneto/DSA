package org.example.basic;

public class BinaryAdditionOf1 {
    public static void main(String[] args) {
        int n = 4;
        String s = "1111111111";
        System.out.println(binaryAdd(n, s));
    }

    static String binaryAdd(int n, String s) {
        char[] arr = s.toCharArray();
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (arr[i] == '0') {
                arr[i] = '1';
                s = String.valueOf(arr);
                return s;
            } else if (arr[i] == '1'){
                arr[i] = '0';
            }
        }
        s = String.valueOf(arr);
        return '1' + s;
    }
}
