package easy;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "baa", magazine = "aabe";
        System.out.println(canContruct(ransomNote, magazine));
    }

    static boolean canContruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets = new int[26];

        for (char c:magazine.toCharArray()) {
            alphabets[c-'a']++;
        }

        for (char c:ransomNote.toCharArray()) {
            if (alphabets[c-'a'] == 0) return false;
            alphabets[c-'a']--;
        }
        return true;

    }
}
