package org.example.school;

public class RemoveVowelsFromString {
    public static void main(String[] args) {
        String S = "welcome to geeksforgeeks";
        System.out.print(removeVowels(S));
    }

    static String removeVowels(String S) {
        return S.replaceAll("[[aeiouAEIOU]]", "");
    }

    static String removeVowels2(String S) {
        String[] arr = S.split("");
        S = "";
        for (int i = 0; i < arr.length; i++) {
            char[] v = arr[i].toCharArray();
            for (int j = 0; j < v.length; j++) {
                if (v[j] == 'a' || v[j] == 'e' || v[j] == 'i' || v[j] == 'o' || v[j] == 'u') {
                    S += "";
                } else {
                    S += v[j];
                }
            }
        }
        return S;
    }
}
