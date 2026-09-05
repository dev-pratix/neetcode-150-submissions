class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans = new int[2*nums.length];
        int r=nums.length;
        for(int i =0 ;i<nums.length;i++){
            ans[i] = nums[i];
            if(r<2*nums.length){
            ans[r++]= nums[i];

            }
        }
        return ans;
    }
}