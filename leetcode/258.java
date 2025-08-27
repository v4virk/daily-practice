class Solution {
    public int addDigits(int num) {
        while (num >= 10) {  // Keep reducing until single digit
            int sum = 0;
            while (num > 0) {  // Sum all digits
                sum += num % 10;
                num /= 10;
            }
            num = sum; // Replace num with sum for next iteration
        }
        return num; // Single digit result
    }
}
// s