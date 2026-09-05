class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     Map<Integer,Integer> hMap = new HashMap<>();
     for(int i = 0 ; i < nums.length ; i++){
        hMap.put(nums[i],hMap.getOrDefault(nums[i],0) + 1);
     }   

     List<int[]> list = new ArrayList<>();
     for(Map.Entry<Integer,Integer> entry : hMap.entrySet() ){
        list.add(new int[]{entry.getValue(),entry.getKey()});
     } 

     Collections.sort(list,(a,b)->b[0]-a[0]);
     int [] result = new int[k];
     for(int i = 0 ; i < k ; i++){  
            result[i] = list.get(i)[1];
     }

     return result;
    }
}
