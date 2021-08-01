
import static org.junit.jupiter.api.Assertions.*;

class LazySingletonTest {

    @org.junit.jupiter.api.Test
    void getInstanceTest() {
        LazySingleton object1 = LazySingleton.getInstance();
        LazySingleton object2 = LazySingleton.getInstance();
        assertEquals(object1, object2);
    }
}