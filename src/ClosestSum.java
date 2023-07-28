import java.util.Arrays;

public class ClosestSum {
    public static void main(String[] args) {
        int first[] = {10, 12, 15, 18, 20};
        int second[] = {1, 4, 6, 8};
        int target = 22;
        findClosestSum(first, second, target);
    }

    public static void findClosestSum(int[] first, int[] second, int target) {
        int diff = Integer.MAX_VALUE;
        int[] pair = new int[2];

        for (int firstElement : first) {
            for (int secondElement : second) {
                int tempDiff = Math.abs((firstElement + secondElement) - target);
                if (tempDiff < diff) {
                    diff = tempDiff;
                    pair[0] = firstElement;
                    pair[1] = secondElement;
                }
            }
        }
        System.out.println(Arrays.toString(pair));
    }
}
