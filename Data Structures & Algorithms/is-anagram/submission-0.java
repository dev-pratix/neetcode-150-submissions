class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
            Map<Character , Integer> hMap = new HashMap<>();
            for(int i = 0 ; i< s.length();i++){
                hMap.put(s.charAt(i),hMap.getOrDefault(s.charAt(i),0)+1);
                hMap.put(t.charAt(i),hMap.getOrDefault(t.charAt(i),0)-1);
            }

            for(int i : hMap.values()){
                if(i > 0) return false;
            }
            return true;
    }
}
