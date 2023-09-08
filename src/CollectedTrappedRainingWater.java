public class CollectedTrappedRainingWater {
    public static void main(String[] args) {
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
//        int[] heights ={1,2,3,4,5,4,3,2,1};
        int collectedTrappedWater = collectedTrappedWater(heights);
        System.out.println(collectedTrappedWater);
        collectedTrappedWaterUsingSingleLoop(heights);
    }

    public static void collectedTrappedWaterUsingSingleLoop(int[] heights){
        int maxLeft=Integer.MIN_VALUE;
        int maxRight=Integer.MIN_VALUE;
        int left=0;
        int right= heights.length-1;
        int count=0;
        while (left<right){
            if(heights[left]<=heights[right]){
                if(heights[left]>maxLeft){
                    maxLeft=heights[left];
                }
                else {
                    count=count+maxLeft-heights[left];
                }
                left++;
            }
            else {
                if(heights[right]>=maxRight){
                    maxRight=heights[right];
                }
                else {
                    count=count+maxRight-heights[right];
                }
                right--;
            }
        }
        System.out.println(count);

    }
    public static int collectedTrappedWater(int[] heights) {
        int totalTrappedWater=0;
        int max=Integer.MIN_VALUE;
        int maxIndex=0;
        for (int i = 0; i < heights.length; i++) {
            if(max<heights[i]){
                max=heights[i];
                maxIndex=i;
            }
        }

        int leftMaxIndex=maxIndex;
        int currentMaxIndex=maxIndex;
        while(leftMaxIndex!=0) {
            int leftMax = Integer.MIN_VALUE;
            for (int i = 0; i < currentMaxIndex; i++) {
                if (leftMax < heights[i]) {
                    leftMax = heights[i];
                    leftMaxIndex = i;
                }
            }
            int trappedWater = calculateTrappedWater(leftMax, leftMaxIndex, currentMaxIndex, heights);
            totalTrappedWater+=trappedWater;
            currentMaxIndex=leftMaxIndex;
        }

        int rightMaxIndex=maxIndex;
        currentMaxIndex=maxIndex;
        while (rightMaxIndex!=heights.length-1) {
            int rightMax=Integer.MIN_VALUE;
            for (int i = currentMaxIndex + 1; i < heights.length; i++) {
                if (rightMax < heights[i]) {
                    rightMax = heights[i];
                    rightMaxIndex = i;
                }
            }
            int trappedWater = calculateTrappedWater(rightMax, maxIndex, rightMaxIndex, heights);
            totalTrappedWater+=trappedWater;
            currentMaxIndex=rightMaxIndex;
        }
        return totalTrappedWater;
    }

    public static int calculateTrappedWater(int max,int start,int end,int[] heights){
        int trappedWater=max*(end-start+1);
        for (int i = start; i <=end ; i++) {
            if (heights[i]<=max) {
                trappedWater -= heights[i];
            }
            else {
                trappedWater-=max;
            }
        }
        return trappedWater;
    }
}
