package org.example.basic;

public class CheckForSubsequence {
    public static void main(String[] args) {
        String A = "AXY", B = "YADXCP";
        //System.out.println(B.substring(3, B.length()));
        System.out.println(isSubSequence(A, B));
    }

    static boolean isSubSequence(String A, String B) {
        int count = 0;
        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) == A.charAt(count)) {
                count++;
            }
            if (count == A.length()) return true;
        }
        return false;
    }

    static boolean isSubSequence2(String A, String B) {
        boolean isSubsequence = false;
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                if (A.charAt(i) == B.charAt(j)) {
                    isSubsequence = true;
                    B = B.substring(j, B.length());
                    break;
                } else {
                    isSubsequence = false;
                }
            }
        }
        return isSubsequence;
    }
}
