import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class TasksWithMaxProfit {
    public static void main(String[] args) {

        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task(1, 9, 15));
        taskList.add(new Task(2, 2, 2));
        taskList.add(new Task(3, 5, 18));
        taskList.add(new Task(4, 7, 1));
        taskList.add(new Task(5, 4, 25));
        taskList.add(new Task(6, 2, 20));
        taskList.add(new Task(7, 5, 8));
        taskList.add(new Task(8, 7, 10));
        taskList.add(new Task(9, 4, 12));
        taskList.add(new Task(10, 3, 5));
        calculateMaxProfit(taskList);
    }

    public static void calculateMaxProfit(List<Task> list) {
        int taskDeadline = list.stream().max((task1, task2) -> task1.getTaskDeadline() - task2.getTaskDeadline()).get().getTaskDeadline();
        Task[] tasks = new Task[taskDeadline];
        list.sort((task1, task2) -> task2.getProfit() - task1.getProfit());
        for (Task task : list) {
            for (int i = task.getTaskDeadline() - 1; i >= 0; i--) {
                if (tasks[i] == null) {
                    tasks[i] = task;
                    break;
                }
            }
        }
        Integer sum = Arrays.stream(tasks).filter(Objects::nonNull).map(Task::getProfit).reduce(0, Integer::sum);
        System.out.println(sum);

    }
}