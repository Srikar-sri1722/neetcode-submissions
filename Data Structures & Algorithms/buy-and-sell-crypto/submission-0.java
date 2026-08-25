class Solution {
    public int maxProfit(int[] p) {
        int min=p[0];
        int profit=0;
        for(int i:p){
            int cost=i-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,i);
        }
        return profit;
    }
}
