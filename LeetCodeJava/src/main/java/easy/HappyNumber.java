package easy;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = square(slow);
            fast = square(square(fast));
        } while(slow != fast);

        return slow == 1;
    }

    private static int square(int n) {
        int ans = 0;
        while (n > 0) {
            int r = n % 10;
            ans += r * r;
            n /= 10;
        }
        return ans;
    }
}
