package NeetCode;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Concept of sliding window
 */
public class AnagramInString {
    public static void main(String[] args) {
        findAnagrams("cbaebabacd","abc");
    }
    public static List<Integer> findAnagrams(String s, String p) {
        String fMap = evaluateFrequencymap(p);




        return null;
    }

    private static String evaluateFrequencymap(String p) {
        Map<Character, Long> frequencyMap = p.chars().mapToObj(characterStream -> (char) characterStream)
                .collect(Collectors.groupingBy(input -> input, Collectors.counting()));
        StringBuilder stringBuilder = new StringBuilder();
        frequencyMap.forEach((character, frequency) -> stringBuilder.append(character).append(frequency));
        return stringBuilder.toString();
    }

}
