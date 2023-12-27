package easy;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle));
    }

    static int titleToNumber(String columnTitle) {
        int res = 0;
        for (int i = columnTitle.length() - 1; i >= 0 ; i--) {
            char c = columnTitle.charAt(i);
            int pow = Math.abs(i - columnTitle.length() + 1);
            res += (c - 64) * Math.pow(26, pow);
        }
        return res;
    }
}
