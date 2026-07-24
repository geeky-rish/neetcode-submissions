class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3)
            return res;
        Arrays.sort(nums);
        for (int k = 0; k < nums.length - 2; k++) {
            // Skip duplicate fixed element
            if (k > 0 && nums[k] == nums[k - 1])
                continue;
            int target = -nums[k];
            int i = k + 1;
            int j = nums.length - 1;
            while (i < j) {
                int sum = nums[i] + nums[j];
                if (sum < target) {
                    i++;
                } else if (sum > target) {
                    j--;
                } else {
                    res.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    i++;
                    j--;
                    // Skip duplicate left values
                    while (i < j && nums[i] == nums[i - 1])
                        i++;
                    // Skip duplicate right values
                    while (i < j && nums[j] == nums[j + 1])
                        j--;
                }
            }
        }
        return res;
    }
}