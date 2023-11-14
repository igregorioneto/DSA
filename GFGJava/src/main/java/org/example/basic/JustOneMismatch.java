package org.example.basic;

import java.util.ArrayList;

public class JustOneMismatch {
    public static void main(String[] args) {
        int N = 6;
        String arr[] = {"vnkjscvkj" ,"shvhsk" ,"kskhvkjsdk" ,"bshv," ,"bjsd"};
        String S = "hfkjdshf";
        System.out.println(isStringExist(arr, N, S));
    }

    static String isStringExist(String arr[], int N, String S) {
        int len = S.length();

        for (String x:arr) {
            if (x.length() == len) {
                int count = 0;
                for (int i = 0; i < len; i++) {
                    if (count < 2) {
                        if (x.charAt(i) != S.charAt(i)) {
                            count++;
                        }
                    } else {
                        break;
                    }
                }
                if (count == 1) {
                    return "True";
                }
            } else {
                continue;
            }
        }

        return "False";
    }
}
