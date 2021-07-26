import org.junit.Test;

import static org.junit.Assert.*;

public class ItemRegistryTest {

    @Test
    public void get() {
        ItemRegistry registry  = new ItemRegistry();
        Item item1 = registry.get(1L);
        Item item2 = registry.get(1L);
        assertNotEquals(item1.hashCode(), item2.hashCode());
    }
}