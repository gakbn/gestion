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

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            System.out.println("Tareas pendientes:");
            for (String tarea : tareas) {
                System.out.println("- " + tarea);
            }
        }
    }

    public static void main(String[] args) {
        Gestion gestion = new Gestion();
        Scanner scanner = new Scanner(System.in);
        
        gestion.agregarTarea("Comprar leche");
        gestion.agregarTarea("Estudiar Java");
        gestion.mostrarTareas();
        
        gestion.eliminarTarea("Comprar lec");
        gestion.mostrarTareas();

        scanner.close();
    }
}
