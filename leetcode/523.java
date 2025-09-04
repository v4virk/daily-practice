// continuous subarray sum 

import java.util.*;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;

        // HashMap to store remainder -> index
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);  // Base case

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            int remainder = sum % k;
            if (remainder < 0) remainder += k; // handle negative numbers safely

            if (mp.containsKey(remainder)) {
                if (i - mp.get(remainder) >= 2) {
                    return true;
                }
            } else {
                mp.put(remainder, i);
            }
        }
        return false;
    }
}
