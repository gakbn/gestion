import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gestion {
    private List<String> tareas;

    public Gestion() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
        System.out.println("Tarea '" + tarea + "' añadida.");
    }

    public void eliminarTarea(String tarea) {
        if (tareas.remove(tarea)) {
            System.out.println("Tarea '" + tarea + "' eliminada.");
        } else {
            System.out.println("Tarea '" + tarea + "' no encontrada.");
        }
    }
}