import java.util.Arrays;

public class TowerHeightDifference {
    public static void main(String[] args) {
        int k=5;
        int n=4;
        int[] array= {1,2,3,8};
        minimumTowerHeightDifference(array,n,k);
    }

    public static void minimumTowerHeightDifference(int[] array,int n,int k){
        int minDiff=Integer.MAX_VALUE;
        Arrays.sort(array);

        for (int i = 0; i < n; i++) {
            int[] tempArray=array.clone();
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                if(j<=i){
                    tempArray[j]=tempArray[j]+k;
                }
                else {
                    tempArray[j]=tempArray[j]-k;
                }
                if(min>tempArray[j]){
                    min=tempArray[j];
                }
                if(max<tempArray[j]){
                    max=tempArray[j];
                }
            }
            if(minDiff>max-min){
                minDiff=max-min;
            }
        }
        System.out.println(minDiff);
    }
}
