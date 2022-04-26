import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }

    @Test
    void multiplyTest() {
        int actual = JavaFXApp.computeMultiply(3, 3);
        assertEquals(9,actual);
    }

}