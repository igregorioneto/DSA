package easy;

public class AddBinary {
    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println(addBinary(a, b));
    }

    static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int maxLength = Math.max(a.length(), b.length());

        a = padZeros(a, maxLength);
        b = padZeros(b, maxLength);

        for (int i = maxLength - 1; i >= 0 ; i--) {
            int bit1 = a.charAt(i) - '0';
            int bit2 = b.charAt(i) - '0';

            int sum = bit1 + bit2 + carry;
            result.insert(0, sum % 2);

            carry = sum / 2;
        }

        if (carry != 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }

    private static String padZeros(String binary, int maxLength) {
        StringBuilder paddedBinary = new StringBuilder(binary);
        while (paddedBinary.length() < maxLength) {
            paddedBinary.insert(0, '0');
        }
        return paddedBinary.toString();
    }
}
