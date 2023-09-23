import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListExamples {
    public static void main(String[] args) {
        int numElementos = 100000;

        // ArrayList: Medir tiempo para agregar elementos al final
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < numElementos; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList (Agregar al final): " + (endTime - startTime) + " nanosegundos");

        // LinkedList: Medir tiempo para agregar elementos al final
        List<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < numElementos; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList (Agregar al final): " + (endTime - startTime) + " nanosegundos");

        // ArrayList: Medir tiempo para acceder a elementos por índice
        startTime = System.nanoTime();
        for (int i = 0; i < numElementos; i++) {
            int value = arrayList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList (Acceder por índice): " + (endTime - startTime) + " nanosegundos");

        // LinkedList: Medir tiempo para acceder a elementos por índice
        startTime = System.nanoTime();
        for (int i = 0; i < numElementos; i++) {
            int value = linkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList (Acceder por índice): " + (endTime - startTime) + " nanosegundos");

        // ArrayList: Medir tiempo para eliminar elementos en el medio
        startTime = System.nanoTime();
        for (int i = numElementos / 2; i < numElementos / 2 + 1000; i++) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList (Eliminar en medio): " + (endTime - startTime) + " nanosegundos");

        // LinkedList: Medir tiempo para eliminar elementos en el medio
        startTime = System.nanoTime();
        for (int i = numElementos / 2; i < numElementos / 2 + 1000; i++) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList (Eliminar en medio): " + (endTime - startTime) + " nanosegundos");
    }
}
