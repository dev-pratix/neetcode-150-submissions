class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> hMap = new HashMap<>( );
        //here i got the frequencies
        for(int num : nums){
            hMap.put(num , hMap.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)-> hMap.get(a) - hMap.get(b));
        for(int num : hMap.keySet()){
            queue.offer(num);
            if(queue.size() > k){
                queue.poll();
            }
        }

        int[] res = new int[k];
        for(int i = 0 ; i < k; i++){
            res[i] = queue.poll();
        }

        return res;
    }
}
