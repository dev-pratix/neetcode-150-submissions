class Solution {
    public int maxArea(int[] heights) {
        int i = 0 ; 
        int j = heights.length -1;  
        int max = 0;

        while(i < j){
            int minHeight = Math.min(heights[i],heights[j]);
            int width = j - i;
            int currentArea = minHeight*width;
            max = Math.max(max , currentArea);

            if(heights[i]  < heights[j]){
                i ++;
            }else{
                j--;
            }
        }

        return max;
    }
}
