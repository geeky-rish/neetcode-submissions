class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> res = new HashSet<>();
        if(nums==null||nums.length<=1) return false;
        for(int num:nums){
            if(!res.add(num)) return true;
        }
        return false;
    }
}