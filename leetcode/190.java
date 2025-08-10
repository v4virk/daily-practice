class Solution {
    public int reverseBits(int n) {
        int reversed = 0;
                for (int i = 0; i < 32; i++) {
                    // Left-shift the reversed number to make space for the next bit
                    reversed <<= 1;
                    
                    // Extract the least significant bit (LSB) from n
                    int lsb = n & 1;
                    
                    // Add the LSB to the reversed number
                    reversed |= lsb;
                    
                    // Right-shift n to process the next bit
                    n >>>= 1;
        }
    return reversed;
} 
}
