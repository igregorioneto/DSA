package org.example.school;

public class UpperCaseConversion {
    public static void main(String[] args) {
        String str = "i love programming";
        System.out.print(transform(str));
    }

    static String transform(String s) {
        String[] arr = s.split(" ");
        s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i].substring(0,1).toUpperCase().concat(arr[i].substring(1)) + " ";
        }
        return s;
    }
}
