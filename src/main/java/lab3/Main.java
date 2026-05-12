package lab3;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Clothing[] items = {
                new Clothing("Футболка", "Nike", 850.0, "M", "Білий"),
                new Clothing("Джинси", "Levi's", 3200.0, "L", "Синій"),
                new Clothing("Худі", "Adidas", 1800.0, "S", "Сірий")
        };

        System.out.println("Sorted by price (ascending): ");
        Arrays.sort(items, Comparator.comparingDouble(Clothing::getPrice));
        linesOut(items);

        System.out.println("Reverse sorted by brand: ");
        Arrays.sort(items, Comparator.comparing(Clothing::getBrand).reversed());
        linesOut(items);

        // Пошук ідентичного об'єкта (обов'язково за методичкою)
        System.out.println("Searching for exact object...");
        Clothing target = new Clothing("Джинси", "Levi's", 3200.0, "L", "Синій");
        boolean found = false;

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(target)) {
                System.out.println("Object found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Object not found in array.");
        }
    }

    public static void linesOut(Clothing[] items){
        for (Clothing c : items) {
            System.out.println(c);
        }
    }
}