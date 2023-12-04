package org.example.basic;

public class ProductIsEvenOrOdd {
    public static void main(String[] args) {
        String N1 = "12", N2 = "15";
        System.out.println(EvenOdd(N1, N2));
    }

    static int EvenOdd(String n1, String n2) {
        char[] arr1 = n1.toCharArray(), arr2 = n2.toCharArray();
        int size1 = n1.length() - 1, size2 = n2.length() - 1;
        int value1 = arr1[size1] - '0', value2 = arr2[size2] - '0';
        return (value1 * value2) % 2 == 0 ? 1 : 0;
    }
}
