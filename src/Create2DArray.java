import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Create2DArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 1, 2, 3, 1};
        List<List<Integer>> lists = generate2DArray(nums);
        System.out.println(lists);
    }

    public static List<List<Integer>> generate2DArray(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        int start = 0;
        int end = list.size();

        while(list.size()>=0){
            if(start>=end){
                lists.add(integerList);
                integerList = new ArrayList<>();
                start=0;
                end = list.size();
                if(start==0 && end == 0){
                    break;
                }
            }
            if (start<end && !list.isEmpty() && !integerList.contains(list.get(start))){
                integerList.add(list.get(start));
                list.remove(start);
                end = list.size();
                start--;
            }
            start++;
        }
        return lists;
    }
}
