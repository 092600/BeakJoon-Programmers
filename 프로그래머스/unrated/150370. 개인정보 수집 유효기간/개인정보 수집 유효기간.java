
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
         Map<String, Integer> taskExpireMonthMap = getTaskExpireMonthMap(terms);
        LocalDate tDay = getLocalDate(today);

        List<Task> expiredTasks = new ArrayList<Task>();
        

        for (int i = 0; i < privacies.length; i++) {
            String[] tmp = privacies[i].split(" ");
            String date = tmp[0];

            int taskId = i+1;
            String taskName = tmp[1];
            int expiredMonth = taskExpireMonthMap.get(taskName);
            LocalDate createdDate = getLocalDate(date);

            Task task = new Task(taskId, taskName, expiredMonth, createdDate);

            if (task.isExpired(tDay)) {
                expiredTasks.add(task);
            }
            
        }

        int[] answer = new int[expiredTasks.size()];

        for (int i = 0; i < expiredTasks.size(); i++) {
            answer[i] = expiredTasks.get(i).getTaskId();
        }

        return answer;
    }

    static LocalDate getLocalDate(String date) {
        int tYear = Integer.parseInt(date.substring(0, 4));
        int tMonth = Integer.parseInt(date.substring(5, 7));
        int tDay = Integer.parseInt(date.substring(8, 10));

        LocalDate now = LocalDate.of(tYear, tMonth, tDay);

        return now;
    }

    static Map<String, Integer> getTaskExpireMonthMap(String[] terms) {
        Map<String, Integer> taskExpireMonthMap = new HashMap<String, Integer>();

        for (String term : terms) {
            String[] task = term.split(" ");

            taskExpireMonthMap.put(task[0], Integer.parseInt(task[1]));
        }   

        return taskExpireMonthMap;
    }
}

class Task {

    private int taskId;
    private String taskName;

    private int expireMonth;
    private LocalDate createdDate;

    public int getTaskId() {
        return taskId;
    }

    public Task(int taskId, String taskName, int expireMonth, LocalDate createdDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.expireMonth = expireMonth;
        this.createdDate = createdDate;
    }

    boolean isExpired(LocalDate today) {
        LocalDate taskExpireDate = createdDate.plusMonths(expireMonth);
        return (today.isEqual(taskExpireDate)|| today.isAfter(taskExpireDate));
    }

}
