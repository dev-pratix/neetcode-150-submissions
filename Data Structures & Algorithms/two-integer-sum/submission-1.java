class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> calcM = new HashMap<>();
        
        for(int i = 0 ; i< nums.length;i++ ){
            int diff = target - nums[i];
            if(calcM.containsKey(diff)){
                return new int[]{calcM.get(diff),i};
            }

            calcM.put(nums[i],i);
        }

        return null;
    }
}
