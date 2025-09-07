//

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> s = new HashMap<>();
        s.put(0,1);
        int pre_sum = 0;
        int count = 0;

        for(int i = 0; i<nums.length; i++ ){

            pre_sum += nums[i];


            if(s.containsKey(pre_sum - k)){
                count += s.get(pre_sum - k);
            }
            s.put(pre_sum, s.getOrDefault(pre_sum,0)+1);
        }
        
        return count;
    }
}
