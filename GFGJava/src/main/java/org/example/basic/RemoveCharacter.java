package org.example.basic;

public class RemoveCharacter {
    public static void main(String[] args) {
        String string1 = "computer", string2 = "cat";
        System.out.println(removeChars(string1, string2));
    }

    static String removeChars(String string1, String string2) {
        String concat = "";
        for (char c:string1.toCharArray()) {
            if (!string2.contains(String.valueOf(c))) {
                concat += c;
            }
        }
        return concat;
    }
}
