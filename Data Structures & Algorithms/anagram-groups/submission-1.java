class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] crry = s.toCharArray();
            Arrays.sort(crry);
            String str = new String(crry);
            map.putIfAbsent(str,new ArrayList<String>());
            map.get(str).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}
