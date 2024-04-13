package NeetCode;

import java.util.HashMap;

public class Duplicate {
    public static void main(String[] args) {
        int[] ques = {3, 3};
        System.out.println(Duplicate.containsDuplicate(ques));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for (int num : nums) {
            if (ans.containsKey(num))
                return true;
            ans.put(num, num);
        }
        return false;
    }
}
