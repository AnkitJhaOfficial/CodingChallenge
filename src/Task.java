class Task implements Comparable<Task> {
    private int taskId;
    private int taskDeadline;
    private int profit;

    public Task() {

    }

    public Task(int taskId, int taskDeadline, int profit) {
        this.taskId = taskId;
        this.taskDeadline = taskDeadline;
        this.profit = profit;
    }

    public int getTaskId() {
        return taskId;
    }

    public int getTaskDeadline() {
        return taskDeadline;
    }

    public int getProfit() {
        return profit;
    }

    @Override
    public int compareTo(Task task) {
        return this.profit - task.getProfit();
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(this==obj){
//            return true;
//        }
//        else if(obj instanceof Task task){
//            if(this.taskId== ((Task) obj).getTaskId() && this.taskDeadline==((Task) obj).getTaskDeadline() && this.profit==((Task) obj).getProfit()) {
//                return true;
//            }
//        }
//        return false;
//    }
}