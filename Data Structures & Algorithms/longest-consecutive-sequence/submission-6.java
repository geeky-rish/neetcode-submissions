class Solution {
    public int longestConsecutive(int[] nums) {
        // Guard clause for empty array
        if (nums == null || nums.length == 0) return 0;
        
        // Step 1: Dump all numbers into a HashSet
        // This removes duplicates and gives us O(1) lookups
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int maxStreak = 0;
        
        // Step 2: Iterate through the set to find streaks
        for (int num : set) {
            
            // Check if 'num' is the absolute START of a sequence.
            // If the set contains (num - 1), 'num' is NOT the start. We skip it.
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                
                // Keep looking for the next consecutive numbers in the streak
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                
                // Update the global maximum streak found so far
                maxStreak = Math.max(maxStreak, currentStreak);
            }
        }
        
        return maxStreak;
    }
}
