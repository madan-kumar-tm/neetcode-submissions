class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int buyTwo = 0;
        for(int i = 0;i < 2; i++){
            buyTwo += prices[i];
        }
        if(money >= buyTwo){
            return money - buyTwo;
        }
        return money;
    }
}