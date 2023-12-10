package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(Arrays.asList(fizzBuzz(n)).toString());
    }

    static List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                arr.add("FizzBuzz");
            else if (i % 3 == 0)
                arr.add("Fizz");
            else if (i % 5 == 0)
                arr.add("Buzz");
            else
                arr.add(String.valueOf(i));
        }
        return arr;
    }
}
