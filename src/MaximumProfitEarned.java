public class MaximumProfitEarned {
    public static void main(String[] args) {
        int[] stockPrices =  {1, 5, 2, 3, 7, 6, 4, 5};
        int profitEarned = findMaximumProfitEarned(stockPrices);
        System.out.println(profitEarned);
    }

    public static int findMaximumProfitEarned(int[] stockPrices){
        int profit=0;

        for (int i = 0; i < stockPrices.length-1; i++) {
            if(stockPrices[i]<stockPrices[i+1]){
                profit=profit+stockPrices[i+1]-stockPrices[i];
            }
        }
        return profit;
    }
}
