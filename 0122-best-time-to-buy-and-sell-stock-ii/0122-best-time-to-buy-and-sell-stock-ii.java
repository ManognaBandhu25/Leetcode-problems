class Solution {
    public int maxProfit(int[] prices) {
        int maxi = 0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i] < prices[i+1]){
                maxi += prices[i+1] - prices[i];
            }
        }
        return maxi;
    }
}