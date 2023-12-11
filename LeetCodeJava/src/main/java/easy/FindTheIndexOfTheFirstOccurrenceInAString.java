package easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        String haystack = "saadbutsaadsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    static int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) return -1;

        int initial = 0, size = needle.length();
        while (true) {
            if (needle.equals(haystack.substring(initial, size))) {
                break;
            }
            initial++;
            size++;
        }
        return initial;
    }
}
