class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int total = 0;
        for(int i = 0;i<n;i++){
            total = Math.max(nums[i],total+nums[i]);
            sum = Math.max(sum, total);
        }
        return sum;

    }
}
