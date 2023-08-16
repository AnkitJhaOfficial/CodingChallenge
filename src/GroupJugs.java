import java.util.Arrays;

public class GroupJugs {
    public static void main(String[] args) {
        int[] red = {6, 3, 2, 8, 7};
        int[] blue = {8, 6, 7, 2, 3};
        groupTheJugs(red,blue);
    }

    public static void groupTheJugs(int[] red, int[] blue){

        for (int i = 0; i < red.length-1; i++) {
            for (int j = 0; j < red.length-1-i; j++) {
                if(red[j]>red[j+1]){
                    int temp=red[j];
                    red[j]=red[j+1];
                    red[j+1]=temp;
                }
                if(blue[j]>blue[j+1]){
                    int temp=blue[j];
                    blue[j]=blue[j+1];
                    blue[j+1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(red));
        System.out.println(Arrays.toString(blue));
    }
}
