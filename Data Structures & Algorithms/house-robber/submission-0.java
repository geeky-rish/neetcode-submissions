class Solution {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        int prev1 = 0;
        int prev2 = 0;

        for(int num:nums){
            int curr = Math.max(num+prev2, prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
