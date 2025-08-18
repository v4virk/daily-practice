public class 1318 {
    
}
class Solution {
    public int minFlips(int a, int b, int c) {
        int count = 0;
        
        while(a != 0 || b != 0 || c != 0) {
            int bitA = a & 1;
            int bitB = b & 1;
            int bitC = c & 1;
            
            // Check if (bitA | bitB) != bitC
            if ((bitA | bitB) != bitC) {
                if (bitC == 0) {
                    // c wants 0, but (a|b) gives 1
                    // Need to flip all 1s in a and b to 0
                    count += bitA + bitB;
                } else {
                    // c wants 1, but (a|b) gives 0
                    // Both a and b are 0, need to flip one of them
                    count += 1;
                }
            }
            
            // Always shift regardless of condition
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        
        return count;
    }
}
