public class MaximumProfitEarned {
    public static void main(String[] args) {

    }

    public static int findMaximumProfitEarned(int[] stockPrices){
        int profit=0;

        for (int i = 0; i < stockPrices.length; i++) {
            if(stockPrices[i]<stockPrices[i+1]){
                profit=profit+stockPrices[i+1]-stockPrices[i];
            }
        }
        return profit;
    }
}
