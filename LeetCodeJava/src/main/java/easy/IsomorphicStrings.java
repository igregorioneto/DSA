package easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "badc", t = "baba";
        System.out.println(isIsomorphic(s, t));
    }

    static boolean isIsomorphic(String s, String t) {
        int[] map1 = new int[200], map2 = new int[200];
        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            if (map1[s.charAt(i)] != map2[t.charAt(i)])
                return false;
            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
        }
        return true;
    }

    static boolean isIsomorphic2(String s, String t) {
        if (s.length() != t.length()) return false;
        int size = s.length();

        HashMap<Character, Character> c = new HashMap<>();

        for (int i = 0; i < size; i++) {
            if (!c.containsKey(s.charAt(i))) {
                c.put(s.charAt(i), t.charAt(i));
            } else {
                System.out.println(c.get(s.charAt(i)) + " " + t.charAt(i));
                if (c.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }

        return true;
    }
}
