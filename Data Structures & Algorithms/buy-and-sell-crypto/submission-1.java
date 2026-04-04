class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxP = 0;

        while(r <= prices.length-1){
            if(prices[l] < prices[r]){
                maxP = Math.max(maxP, prices[r] - prices[l]);
                System.out.println(maxP);
            }else{
                l = r;
            }

            r++;
        }

        return maxP;
    }
}
