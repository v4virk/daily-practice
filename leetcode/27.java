//remove elements equal to val


class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the new array without the val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move the element that is not equal to val
                k++; // Increment the count of valid elements
            }
        }

        return k; // Return the number of elements that are not equal to val
    }
}

