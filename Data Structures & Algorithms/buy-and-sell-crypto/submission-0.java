class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 0; i < prices.length; i++){
            int temp = prices[i];
            for(int j = i+1; j < prices.length; j++){
                int curMax = prices[j] - temp;
                if(curMax > max){
                    max = curMax;
                }
            }
        }
        return max;
        
    }
}
