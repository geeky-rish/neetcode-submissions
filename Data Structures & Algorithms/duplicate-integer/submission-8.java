class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> res = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(!res.add(nums[i])) return true;
        }
        return false;
    }
}