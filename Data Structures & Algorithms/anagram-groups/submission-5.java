class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> anaMap = new HashMap<>();
        if(strs==null) return new ArrayList<>();
        for(String s:strs){
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String sortStr = String.valueOf(str);
            anaMap.putIfAbsent(sortStr,new ArrayList<>());
            anaMap.get(sortStr).add(s);
        }
        return new ArrayList<>(anaMap.values());
    }
}
