package easy;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int m = accounts.length, max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            int n = accounts[i].length, sum = 0;
            for (int j = 0; j < n; j++) {
                sum += accounts[i][j];
            }
            if (sum > max) max = sum;
        }
        return max;
    }
}
