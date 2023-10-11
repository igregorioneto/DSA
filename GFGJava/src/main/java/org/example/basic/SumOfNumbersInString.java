package org.example.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        String str = "1abc23c2";
        System.out.println(findSum(str));
    }

    public static long findSum(String str) {
        StringBuilder sb = new StringBuilder();
        long sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            } else if (sb.length() > 0) {
                sum += Long.parseLong(sb.toString());
                sb.setLength(0);
            }
        }

        if (sb.length() > 0) {
            sum += Long.parseLong(sb.toString());
        }
        return sum;
    }

    public static long findSum2(String str) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        long sum = 0;
        while (matcher.find()) {
            String number = matcher.group();
            sum += Long.parseLong(number);
        }
        return sum;
    }
}
