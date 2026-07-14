class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        if(strs == null) return res;
        for(String s:strs){
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String s1 = String.valueOf(str);
            map.putIfAbsent(s1, new ArrayList<>()); // Ensures a list exists for this key
            map.get(s1).add(s);                    // Safely fetches the list and adds the string

        }
        return new ArrayList<>(map.values());

    }
}
