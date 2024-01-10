package easy;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(isPowerOfTwo(n));
    }

    static boolean isPowerOfTwo(int n) {
        int i = 0; double p = 0;
        while (true) {
            p = Math.pow(2, i);
            if (p == n)
                return true;
            if (p > n)
                break;
            i++;
        }
        return false;
    }
}
