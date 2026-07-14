class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths don't match, they cannot be anagrams
        if (s.length() != t.length()) return false;
        
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Correctly compares the contents of both sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
