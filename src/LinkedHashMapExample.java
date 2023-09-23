import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new LinkedHashMap<>();

        hashMap.put("Manzana", 10);
        hashMap.put("Banana", 5);
        hashMap.put("Cereza", 8);

        System.out.println("Cantidad de manzanas: " + hashMap.get("Manzana"));

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
