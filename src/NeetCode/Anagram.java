import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * Anagram class contains methods to check if two strings are anagrams of each other.
 *
 * @author Tabnine
 */
public class Anagram {

    /**
     * Checks if two strings are anagrams of each other using sorting.
     *
     * @param s the first string
     * @param t the second string
     * @return true if the strings are anagrams, false otherwise
     */
    public static boolean isAnagramUsingSort(String s, String t) {
        // Check if the lengths of the strings are equal
        if (!Objects.equals(s.length(), t.length()))
            return false;

        // Convert the strings to char arrays and sort them
        char[] c = s.toCharArray();
        char[] u = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(u);

        // Compare the sorted char arrays
        return Arrays.equals(c, u);
    }

    /**
     * Checks if two strings are anagrams of each other using a HashMap.
     *
     * @param s the first string
     * @param t the second string
     * @return true if the strings are anagrams, false otherwise
     */
    public static boolean isAnagramUsingMap(String s, String t) {
        // Check if the lengths of the strings are equal
        if (!Objects.equals(s.length(), t.length()))
            return false;

        // Create two HashMap objects to store the frequency of each character in the strings
        HashMap<Character, Integer> hashMapS = new HashMap<>();
        HashMap<Character, Integer> hashMapT = new HashMap<>();

        // Populate the HashMap objects with the frequency of each character in the strings
        for (Character i : s.toCharArray()) {
            hashMapS.put(i, hashMapS.getOrDefault(i, 0) + 1);
        }
        for (char i : t.toCharArray()) {
            hashMapT.put(i, hashMapT.getOrDefault(i, 0) + 1);
        }

        // Compare the two HashMap objects
        return hashMapS.equals(hashMapT);
    }
}