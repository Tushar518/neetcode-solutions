class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len==0||len ==1){return 0;}
        int j = prices.length -1;
        int i =j-1;
        int profit = 0;
        while(j>i && (i>=0)){
            if((prices[j]-prices[i])>0){
                profit = Math.max(prices[j]-prices[i],profit);
                i--;
            }else{
                j--;
                i=j-1;
            }
        }
        return profit;
        
    }
}
