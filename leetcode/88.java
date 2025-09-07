// merge two sorted arrays

mport java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == 0 && nums2.length == 0){
            return;   // just exit
        }

        if(nums1.length == 0 && nums2.length != 0){
            return;
        }

        if(nums1.length != 0 && nums2.length == 0){
            return;   // nothing to merge
        }

        if(nums1.length != 0 && nums2.length != 0){
            int j = 0;
            for(int i = m; i < m+n; i++){
                nums1[i] = nums2[j];
                j++;
            }
        }

        Arrays.sort(nums1);
    }
}
