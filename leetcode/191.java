// simple bit manipulation algo
// Brian Kernighan's algo 

class Solution {
    public int hammingWeight(int n) {
        int count = 0;
       
        while(n != 0){
            n = n & (n-1);

            // directly jumps to the position of one 
            // like : 11 = 1011 & 10 = 1010
            // only difference is the right most 1 bit  and when we perform the  & operation it gets us the count 1 as the bit gets removed 
            count++;

        }
        return count;
    }
}