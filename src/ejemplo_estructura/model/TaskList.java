package ejemplo_estructura.model;
import java.util.ArrayList;
import java.util.List;
public class TaskList {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
