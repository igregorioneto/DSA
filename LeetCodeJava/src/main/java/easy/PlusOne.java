package easy;

import java.math.BigInteger;

public class PlusOne {
    public static void main(String[] args) {
        int digits[] = {9};
        for (int e:plusOne(digits)) {
            System.out.print(e + " ");
        }
    }

    static int[] plusOne(int[] digits) {
        String n = "";
        for (int e:digits) {
            n+= e;
        }
        BigInteger bitInteger = new BigInteger(n.toString());
        bitInteger = bitInteger.add(BigInteger.ONE);

        n = bitInteger.toString();

        int arr[] = new int[n.length()], count = 0;
        for (char e:n.toCharArray()) {
            arr[count++] = e-'0';
        }
        return arr;
    }
}
