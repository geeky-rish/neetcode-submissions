class Solution {
    public int findMin(int[] nums) {
        int i = 0, j = nums.length-1, mid = 0;
        while(i<j){
            mid = i + (j-i)/2;
            if(nums[mid]>nums[j]) i = mid+1;
            else if(nums[mid]<=nums[j]) j = mid; 

        }
        return nums[i];
    }
}
