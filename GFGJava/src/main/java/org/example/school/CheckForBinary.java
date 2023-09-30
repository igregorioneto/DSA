package org.example.school;

public class CheckForBinary {
    public static void main(String[] args) {
        String str = "70";
        System.out.print(isBinary(str));
    }

    static boolean isBinary(String str) {
        boolean binary = true;
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("0") || arr[i].contains("1")) {
                binary = true;
            } else {
                binary = false;
                break;
            }
        }
        return binary;
    }
}
