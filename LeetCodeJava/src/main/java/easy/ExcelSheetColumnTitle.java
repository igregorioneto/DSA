package easy;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 1;
        System.out.println(convertToTitle(columnNumber));
    }

    static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            int value = (columnNumber - 1) % 26;
            sb.append(Character.toString((char) (65 + value)));
            columnNumber = (columnNumber - 1) / 26;
        }
        return sb.reverse().toString();
    }
}
