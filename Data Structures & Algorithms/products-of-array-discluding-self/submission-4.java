class Solution {
    public int[] productExceptSelf(int[] nums) {
        int nZ = 0;
        int p = 1;
        for( int n : nums){
            if(n ==0)nZ++;
            else p*=n;
        }

int[] res = new int[nums.length];

        if(nZ>1)return res;

        for(int i = 0 ; i < res.length;i++){
            if(nZ == 1){
                res[i] = nums[i]==0 ? p : 0;
            }else{
                res[i]=p/nums[i];
            }
        }

        return res;
    }
}  
