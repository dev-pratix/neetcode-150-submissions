class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> lookUp = new HashSet<>();
        for(int num : nums){
            lookUp.add(num);
        }

        int longest =0 ;
        for(int num : nums){
            if(!lookUp.contains(num -1)){
                int length =1;
                while(lookUp.contains(num + length)){
                    length++;  
                }
                longest = Math.max(longest,length);
            }
        }

    return longest;

    }
}
