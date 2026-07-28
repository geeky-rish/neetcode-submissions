class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = 0;
        for(int i = 0;i<n;i++){
            int profit = 0;
            for(int j = i+1;j<n;j++){
                if(prices[j]<prices[i]) continue;
                profit = Math.max(profit,prices[j]-prices[i]); 
            
            }
            ans = Math.max(ans, profit);
        }
        return ans;
    }
}
