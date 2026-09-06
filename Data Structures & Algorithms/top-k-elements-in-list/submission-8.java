class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hMap = new HashMap<>();
        for(int num : nums){
            hMap.put(num,hMap.getOrDefault(num,0) + 1);
        }

        List<int[]> aList = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : hMap.entrySet()){
            aList.add(new int[]{entry.getValue(),entry.getKey()});
        }

        aList.sort((a,b)->b[0] - a[0]);
        int [] result = new int[k];
        for(int i = 0 ; i < k ; i++){
            result[i]=aList.get(i)[1];
        }

        return result;
    }
}
