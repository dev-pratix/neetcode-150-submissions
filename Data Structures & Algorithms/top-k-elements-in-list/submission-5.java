class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new TreeMap<>(   );

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
List<int[]> resList = new ArrayList<>();

for(Map.Entry<Integer,Integer> entry : map.entrySet()){

    resList.add(new int[]{entry.getValue(),entry.getKey()});
}

resList.sort((a,b)->b[0]-a[0]);

int []res=new int[k];
for(int i = 0 ; i<k;i++ ){
    res[i] = resList.get(i)[1];
}
       return res;
}
}
