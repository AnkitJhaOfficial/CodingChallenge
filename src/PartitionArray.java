import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionArray {
    public static void main(String[] args) {
//        int[] arr = {2, 2, 3, 3, 4, 5, 5, 24};
        int[] arr = {1, 3, 5};
        System.out.println(isPartitionPossible(arr));
    }

    public static String isPartitionPossible(int[] array) {
        int sum = Arrays.stream(array).sum();
        if (sum % 2 == 1) {
            return "NO";
        }

        int leftSum = sum;
        int rightSum = 0;
        Arrays.sort(array);
        List<Integer> leftList = Arrays.stream(array).boxed().collect(Collectors.toList());
        List<Integer> rightIntegerList = new ArrayList<>();
        rightIntegerList.add(leftList.remove(leftList.size() - 1));
        leftSum = leftSum - rightIntegerList.get(0);
        rightSum = rightSum + rightIntegerList.get(0);

        int divisor = 2;
        int diff = Math.abs(leftSum - rightSum);

        while (leftSum > rightSum) {
            int temp = diff / divisor;

            while (!leftList.contains(Integer.valueOf(temp))) {
                temp--;
                if (temp == 0)
                    return "No";
            }
            leftList.remove(Integer.valueOf(temp));
            leftSum = leftSum - temp;
            rightIntegerList.add(temp);
            rightSum = rightSum + temp;
            diff = leftSum - rightSum;

        }
        if (leftSum == rightSum)
            return "YES";
        return "NO";
    }
}
