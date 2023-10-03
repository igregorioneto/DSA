package org.example.school;

public class CountOfCamelCaseCharacters {
    public static void main(String[] args) {
        String S = "ckjkUUYII";
        System.out.print(countCamelCase(S));
    }

    static int countCamelCase(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
                count++;
        }
        return count;
    }
}
