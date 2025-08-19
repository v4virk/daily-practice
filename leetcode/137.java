public class 137 {
    
}
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int temp = (1 << i); // mask for the i-th bit
            int count_1 = 0;

            // Count how many numbers have the i-th bit set
            for (int n : nums) {
                if ((n & temp) != 0) {
                    count_1++;
                }
            }

            // If count_1 % 3 != 0, that means the single number has this bit set
            if (count_1 % 3 != 0) {
                result |= temp;
            }
        }

        return result;
    }
}
