package NeetCode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * A note for understanding HashMap -> Any Object that overrides EQUALS & HASHCODE can be used as a Key in a HashMap
 */
public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagramsWithKeyAsHashMap(strs);
    }

    private static List<List<String>> groupAnagramsWithKeyAsHashMap(String[] strs) {
        if (Objects.isNull(strs) || strs.length == 0)
            return new ArrayList<>();
        HashMap<HashMap<Character, Integer>, ArrayList<String>> hashMapArrayListHashMap = new HashMap<>();
        for (String s : strs) {
            HashMap<Character, Integer> fMap = new HashMap<>();
            /*
            However,
            the enhanced for loop cannot be directly used with primitive data types like int, float, double, etc.,
            because they are not iterable collections.
            The enhanced for loop expects an iterable object, such as an array or a collection, that provides an iterator interface.
             */
            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                fMap.put(c, fMap.getOrDefault(c, 0) + 1);
            }
            ArrayList<String> previousValue;
            if (hashMapArrayListHashMap.containsKey(fMap)) {
                previousValue = hashMapArrayListHashMap.get(fMap);
            } else {
                previousValue = new ArrayList<>();
            }
            previousValue.add(s);
            hashMapArrayListHashMap.put(fMap, previousValue);
        }

        List<List<String>> ans = new ArrayList<>();
        for(ArrayList<String> arrayList : hashMapArrayListHashMap.values()){
            ans.add(arrayList);
        }


        return ans;
    }

    /**
     * @param strs
     * @return
     */
    public static List<List<String>> groupAnagramsWithSortingWithProblem(String[] strs) {
        if (Objects.isNull(strs) || strs.length == 0)
            return new ArrayList<>();
        // array can't be a key of hashmap this will create issue.
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
    * This will not pass all test case due to not maintaining order
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

/**
 * Hashmap Thoery of collision
 * In the context of HashMaps, a collision occurs when two or more distinct keys map to the same bucket or index in the underlying array structure of the HashMap.
 * This can happen due to the way HashMap resolves hash codes into array indices using a process called hashing.
 *
 * When you insert a key-value pair into a HashMap, the HashMap calculates the hash code of the key and then uses this hash code to determine the index where the key-value pair should be stored in the underlying array.
 * However, since the range of possible hash codes is much larger than the size of the array, multiple keys may end up with the same hash code, resulting in a collision.
 *
 * HashMap handles collisions by using a technique called chaining.
 * In a chaining collision resolution strategy, each bucket in the array can hold multiple key-value pairs.
 * When a collision occurs, the new key-value pair is added to the bucket corresponding to the calculated index, forming a linked list of entries in that bucket.
 *
 * When you need to retrieve a value associated with a key, the HashMap calculates the hash code of the key and uses it to determine the bucket.
 * Then, it searches the linked list in that bucket to find the entry with the matching key.
 * This process ensures that even if multiple keys collide, the correct value can still be retrieved.
 *
 * While collisions are a natural consequence of hashing, excessive collisions can degrade the performance of the HashMap,
 * as it increases the length of the linked lists and slows down retrieval operations.
 * To mitigate collisions, it's important to choose a good hashing algorithm for keys and ensure that the HashMap is appropriately sized to distribute entries evenly across buckets.
 * Additionally, in Java, the HashMap class automatically handles resizing and rehashing to maintain performance even as the number of entries grows.
 */
