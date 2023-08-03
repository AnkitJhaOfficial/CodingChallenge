import java.util.Arrays;

public class ArrangeElements {

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        int pos[] = { 3, 2, 4, 1, 0 };
        arrangeElementsBasedOnPosition(nums,pos);
        System.out.println(Arrays.toString(nums));

    }

    public static void arrangeElementsBasedOnPosition(int nums[],int pos[]){

        for (int i = 0; i < pos.length-1; i++) {
            for (int j = 0; j < pos.length-i-1; j++) {
                if(pos[j]>pos[j+1]){
                    int temp =pos[j];
                    pos[j]=pos[j+1];
                    pos[j+1]=temp;
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}