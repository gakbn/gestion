import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    private List<String> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Tarea '" + task + "' añadida.");
    }

    public void removeTask(String task) {
        if (tasks.remove(task)) {
            System.out.println("Tarea '" + task + "' eliminada.");
        } else {
            System.out.println("Tarea '" + task + "' no encontrada.");
        }
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            System.out.println("Tareas pendientes:");
            for (String task : tasks) {
                System.out.println("- " + task);
            }
        }
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        
        // Ejemplo de uso
        manager.addTask("Comprar leche");
        manager.addTask("Estudiar Java");
        manager.showTasks();
        
        manager.removeTask("Comprar leche");
        manager.showTasks();

        scanner.close();
    }
}
