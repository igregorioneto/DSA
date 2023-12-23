package easy;
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]", "");
        String reverse = String.valueOf(sb.append(s).reverse());
        if (s.equals(reverse))
            return true;
        return false;
    }
}
