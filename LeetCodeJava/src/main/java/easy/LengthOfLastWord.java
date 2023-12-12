package easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Today is a nice day";
        System.out.println(lengthOfLastWord(s));
    }

    static int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");
        return arr[arr.length - 1].length();
    }
}
