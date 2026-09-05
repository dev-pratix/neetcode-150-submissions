class Solution {
    public int[] productExceptSelf(int[] nums) {
       int numOfZero = 0 ; 
       int prod = 1;

       for(int num : nums){
        if(num == 0){
            numOfZero++;
        }else{
            prod *=num;
        }
       }

       int []res = new int[nums.length];
       for(int i =0 ; i < nums.length;i++){
        if(numOfZero > 1){
            return new int[nums.length];
        }
        if(numOfZero >0){
            res[i]=nums[i] == 0?prod : 0;
            }
            else
            res[i] = prod/nums[i];
       }
       return res;
    }
}  
