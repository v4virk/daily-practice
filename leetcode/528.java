// random selector based upon weight 


class Solution {
    int[] sum; // prefix sum of the array 

    Random rd = new Random();

    int max = 0 ;

    public Solution(int[] w) {
        sum = new int[w.length];
        sum[0] = w[0]; //. first elemnt sum

        for(int i = 1 ; i< w.length; i++){
            sum[i] = sum[i-1]  + w[i];
        }

        max = sum[sum.length - 1];

    }
    
    public int pickIndex() {

        // here we will perform the binary search;

        int l = 0 ; // left pointer
        int r = sum.length-1; // right pointer ;

        int target_v = 1+rd.nextInt(max);

        while(l <= r){
            int mid =  l + (r - l)/2; 

            if(sum[mid] == target_v){
                return mid;
            }
            if(sum[mid] > target_v -1){
                r = mid -1;

            }
            else{
                l = mid +1;

            }
        }
        return l ;

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */