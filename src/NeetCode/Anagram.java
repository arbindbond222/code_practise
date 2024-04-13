package NeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Anagram {
    public static void main(String[] args) {
        isAnagramUsingSort("as", "sa");
    }

    public static boolean isAnagramUsingSort(String s, String t) {
        if (!Objects.equals(s.length(), t.length()))
            return false;
        char[] c = s.toCharArray();
        char[] u = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(u);
        return Arrays.equals(c, u);
    }

    public static boolean isAnagramUsingMap(String s, String t) {
        if (!Objects.equals(s.length(), t.length()))
            return false;
        HashMap<Character, Integer> hashMapS = new HashMap<>();
        HashMap<Character, Integer> hashMapT = new HashMap<>();
        for (Character i : s.toCharArray()) {
            hashMapS.put(i, hashMapS.getOrDefault(i, 0) + 1);
        }
        for (char i : t.toCharArray()) {
            hashMapT.put(i, hashMapT.getOrDefault(i, 0) + 1);
        }
        return hashMapS.equals(hashMapT);
    }
}
