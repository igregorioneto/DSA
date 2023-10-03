package org.example.school;

public class ConvertAListOfCharactersIntoAString {
    public static void main(String[] args) {
        int N = 13;
        char[] arr = {'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's'};
        System.out.print(chartostr(arr, N));
    }

    static String chartostr(char arr[], int N) {
        return new String(arr);
    }

    static String chartost2r(char arr[], int N) {
        String s = "";
        int i;
        for (i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }
}
