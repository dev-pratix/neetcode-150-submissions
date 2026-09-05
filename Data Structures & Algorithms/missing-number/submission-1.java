class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int f = n * (n + 1 ) / 2;
        int result = 0;
        for(int i : nums){
            result+=i;
        }

        return f - result;
    }
}
