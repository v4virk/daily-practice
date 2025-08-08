// this problem will be solved directly by dequeue

// import java.util.Queue;
//offer() -> enter the elements in the queue;
//pollFirst() -> remove first element;
//pollLast() -> remove the last element;
//peekFirst() -> first elment ;
//peekLast() -> last element;

// isEmpty();



import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        if(nums == null || k == 0){
            return new int[0];
        }

        int[] result = new int[nums.length - k + 1];

        Deque<Integer> maxQ = new LinkedList<>();

        for(int i = 0; i< nums.length; i++){
            while(!maxQ.isEmpty() && maxQ.peekFirst() < i - k + 1){
                maxQ.pollFirst();
            }

            while(!maxQ.isEmpty() && nums[maxQ.peekLast()] < nums[i]){
                maxQ.pollLast();
            }

            maxQ.offerLast(i);

            if(i>= k -1){
                result[i-k+1] = nums[maxQ.peekFirst()];
            }
        }

    return result;
        
    }
}