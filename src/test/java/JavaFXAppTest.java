import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }

    @Test
    void add_number_with_number() {
        int number1 = 7;
        int number2 = 4;

        int expected = 11;
        int actual = JavaFXApp.computeAdd(number1, number2);

        assertEquals(expected, actual);
    }
}