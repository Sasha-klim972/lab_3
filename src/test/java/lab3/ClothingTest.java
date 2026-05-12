package lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClothingTest {

    @Test
    void testEqualsSameObjects() {
        Clothing c1 = new Clothing("Футболка", "Nike", 850.0, "M", "Білий");
        Clothing c2 = new Clothing("Футболка", "Nike", 850.0, "M", "Білий");

        assertEquals(c1, c2);
    }

    @Test
    void testEqualsDifferentPrice() {
        Clothing c1 = new Clothing("Футболка", "Nike", 850.0, "M", "Білий");
        Clothing c2 = new Clothing("Футболка", "Nike", 999.0, "M", "Білий");

        assertNotEquals(c1, c2);
    }
}