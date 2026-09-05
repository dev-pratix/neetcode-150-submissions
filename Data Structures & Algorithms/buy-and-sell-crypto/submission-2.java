class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int walker =0,runner = 1;
         int current =0;
        while(walker<runner && runner < prices.length){
            if(prices[walker] >= prices[runner]){
                walker=runner;
                current =0;
                runner++;
            }else{
                current = prices[runner] - prices[walker];
                System.out.println("Runner : "+ runner + " Walker : "+walker);
                result= Math.max(current,result);
                runner++;
            }
        }

        return result;
    }
}
