package NeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagramsWithoutSorting(strs);
    }

    /**
     * @param strs
     * @return
     */
    public static List<List<String>> groupAnagramsWithSortingWithProblem(String[] strs) {
        if (Objects.isNull(strs) || strs.length == 0)
            return new ArrayList<>();
        HashMap<char[], List<String>> hashMap = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            // hashmap will not be able to compare properly as key is array because array doesn't override equals and hashcode
            // so it will be impossible for hash to calculate the proper bucket
            if (hashMap.containsKey(chars)) {
                List<String> existingValues = hashMap.get(chars);
                existingValues.add(s);
                hashMap.put(chars, existingValues);
            } else {
                ArrayList<String> values = new ArrayList<>();
                values.add(s);
                hashMap.put(chars, values);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<char[], List<String>> entry : hashMap.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }

    /**
     * @param strs
     * @return
     */
    public static List<List<String>> groupAnagramsWithSorting(String[] strs) {
        if (Objects.isNull(strs) || strs.length == 0)
            return new ArrayList<>();
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            if (hashMap.containsKey(sortedString)) {
                List<String> existingValues = hashMap.get(sortedString);
                existingValues.add(s);
                hashMap.put(sortedString, existingValues);
            } else {
                ArrayList<String> values = new ArrayList<>();
                values.add(s);
                hashMap.put(sortedString, values);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : hashMap.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }

    /**
     * We will be using frequency map
     *
     * @param strs
     * @return
     */
    public static List<List<String>> groupAnagramsWithoutSorting(String[] strs) {
        if (Objects.isNull(strs) || strs.length == 0)
            return new ArrayList<>();
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String s : strs) {
            //helper method to return frequency
            String frequencyString = frequencyMapString(s);
            if (hashMap.containsKey(frequencyString)) {
                List<String> existingValues = hashMap.get(frequencyString);
                existingValues.add(s);
                hashMap.put(frequencyString, existingValues);
            } else {
                ArrayList<String> a = new ArrayList<>();
                a.add(s);
                hashMap.put(frequencyString, a);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : hashMap.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }

    /*
    Using Java 8 stream
     */
    private static String frequencyMapString(String s) {
        Map<Character, Long> frequencyMap = s.chars().mapToObj(characterStream -> (char) characterStream)
                .collect(Collectors.groupingBy(input -> input, Collectors.counting()));
        StringBuilder stringBuilder = new StringBuilder();
        frequencyMap.forEach((character, frequency) -> {
            stringBuilder.append(character).append(frequency);
        });

        return stringBuilder.toString();
    }
}
