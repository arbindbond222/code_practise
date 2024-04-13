package NeetCode;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        groupAnagramsWithSorting(strs);
    }

    public static List<List<String>> groupAnagramsWithSorting(String[] strs){
        if(Objects.isNull(strs) || strs.length==0)
            return new ArrayList<>();
        HashMap<char[], List<String>> hashMap = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            // hashmap will not be able to compare properly as key is array because array doesn't overrides equals and hashcode
            // so it will be impossible for hash to calculate the proper bucket
            if(hashMap.containsKey(chars)){
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
        for(Map.Entry<char[], List<String>> entry : hashMap.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
