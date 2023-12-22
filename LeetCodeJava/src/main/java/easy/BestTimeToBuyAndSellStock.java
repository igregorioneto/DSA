package easy;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int prices[] = {1,4,2};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for (int price:prices) {
            minPrice = Math.min(minPrice, price);
            maxPrice = Math.max(maxPrice, price - minPrice);
        }
        return maxPrice;
    }

    static int maxProfit2(int[] prices) {
        int i = 0, j = i + 1, max = 0;
        while (i < prices.length) {
            while (j < prices.length) {
                if (prices[j] - prices[i] > max) max = prices[j] - prices[i];
                j++;
            }
            i++;
            j = i + 1;
        }
        return max;
    }

    static int maxProfit3(int[] prices) {
        int max = 0;
        int calc = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length - 1; j++) {
                calc = prices[j + 1] - prices[i];
                if (calc > max) max = calc;
            }
        }
        return max;
    }
}
