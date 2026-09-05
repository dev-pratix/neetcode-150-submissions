class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char [] r = s.toCharArray();
        char [] p = t.toCharArray();
        Arrays.sort(r);
        Arrays.sort(p);
        for(int i = 0 ; i < s.length();i++){
            if(r[i] != p[i]){
                return false;
            }
        }
        return true;
    }
}
