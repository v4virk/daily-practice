// Find the next greater element for each element in nums1 from nums2

import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Map to store "element -> next greater"
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2
        for (int num : nums2) {
            // If current num is greater than top of stack, it's the "next greater" for stack top
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            // Push current num to stack
            stack.push(num);
        }

        // For remaining elements in stack, no next greater exists
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Prepare result for nums1
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        return res;
    }
}
