class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        if(s.equals(t)) return true;
        
        int[] seen = new int[26];
        for(int i = 0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            seen[c1-'a']++;
            seen[c2-'a']--;

        }
        for(int i = 0;i<seen.length;i++)
            if(seen[i]!=0) return false;
        return true;
}
}