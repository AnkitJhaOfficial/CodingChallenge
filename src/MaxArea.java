public class MaxArea {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int maxArea = findMaxArea(arr);
        System.out.println(maxArea);
    }

    public static int findMaxArea(int[] arr){
        int maxArea=0;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int area=0;
                if(arr[i]>arr[j]){
                    area=arr[j]*(j-i);
                }
                else {
                    area=arr[i]*(j-i);
                }
                if(area>maxArea){
                    maxArea=area;
                }
            }
        }
        return maxArea;
    }

}
