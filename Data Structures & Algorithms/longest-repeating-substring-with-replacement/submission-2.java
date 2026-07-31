class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int l = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int r = 0; r < s.length(); r++) {

            // Add current character to the window
            freq[s.charAt(r) - 'A']++;

            // Update maximum frequency in the window
            maxFreq = Math.max(maxFreq, freq[s.charAt(r) - 'A']);

            // Shrink window if more than k replacements are needed
            while ((r - l + 1) - maxFreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            // Update answer
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}