// for short values 

class Solution {
    public boolean isPowerOfTwo(int n) {
        int k = (n/2) ;
        ArrayList<Integer> pow2 = new ArrayList<>();
        pow2.add(1);

        for(int i = 1; i <= k; i++){
            pow2.add(pow2.get(i-1) * 2);
        }

        return pow2.contains(n);
    }
}



// using bit manipulationn
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false; // Handle non-positive numbers
        return (n & (n - 1)) == 0; // Check if only one bit is set
    }
}