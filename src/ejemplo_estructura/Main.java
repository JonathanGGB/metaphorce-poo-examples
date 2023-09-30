package ejemplo_estructura;
import ejemplo_estructura.model.TaskList;
import ejemplo_estructura.view.TaskView;
import ejemplo_estructura.controller.TaskController;

public class Main {

    public static void main(String[] args) {
        TaskList tasks = new TaskList();
        TaskView taskView = new TaskView();
        TaskController taskController = new TaskController(tasks, taskView);

        taskController.addTask("Tarea 1", true, "Lunes");
        taskController.addTask("Tarea 2", false, "Martes");
        taskController.addTask("Tarea 3", true, "Domingo");

        taskController.displayTasks();
    }
}
