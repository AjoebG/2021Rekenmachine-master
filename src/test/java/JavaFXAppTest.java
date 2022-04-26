import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }
    @Test
    public void divideTest(){
        JavaFXApp test = new JavaFXApp();

        int expected = 2;
        int actual = test.computeDivide(4,2);

        Assertions.assertEquals(expected, actual);
    }
}