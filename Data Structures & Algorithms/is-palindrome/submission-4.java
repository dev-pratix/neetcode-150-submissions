class Solution {
    public boolean isPalindrome(String str) {
      StringBuilder sb = new StringBuilder();
      for(char c : str.toCharArray()){
        if(Character.isLetterOrDigit(c)){
            sb.append(Character.toLowerCase(c));
        }
      }
      return sb.toString().equals(sb.reverse().toString());
    }
}
