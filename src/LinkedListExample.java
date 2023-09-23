import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        //Agregar elementos a una lista
        list.add("Hola"); // Elemento 0
        list.add("Mundo"); // Elemento 1

        //Consultar un elemento
        String hello = list.get(0) + " " + list.get(1);
        System.out.println((hello));
        list.remove(0);
        for(String element : list){
            System.out.println(element);
        }
    }
}
