// Last updated: 16/06/2026, 14:02:16
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int lowest=prices[0];
        for(int i=1;i<prices.length;i++){
            if(lowest>prices[i]){
            lowest=prices[i];
            }
            else{
                int profit = prices[i] - lowest;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
        
    }
}