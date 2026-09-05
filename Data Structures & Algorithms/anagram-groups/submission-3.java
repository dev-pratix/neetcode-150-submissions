class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> execMap = new HashMap<>();
        for(String s : strs){
            char[] keyA = s.toCharArray();
            Arrays.sort(keyA);
            String key = new String(keyA);
            if(!execMap.containsKey(key)){
                List<String> list = new ArrayList<>();
                list.add(s);
                execMap.put(key,list);
            }
            else{
                execMap.get(key).add(s);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(List<String> l : execMap.values()){
            result.add(l);
        }

        return result;
    }
}
