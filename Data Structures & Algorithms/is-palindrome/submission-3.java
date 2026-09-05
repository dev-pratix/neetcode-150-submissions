class Solution {
    public boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        String s = str.toUpperCase();

        while (i < j) {

            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;

            if (s.charAt(i) != s.charAt(j)) return false;

            i++;
            j--;
        }
        return true;
    }
}
