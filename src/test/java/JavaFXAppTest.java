import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }


    @Test
    public void add_number_with_number() {
        int number1 = 7;
        int number2 = 4;

        int expected = 11;
        int actual = JavaFXApp.computeAdd(number1, number2);

        assertEquals(expected, actual);
    }

  @Test
    public void divideTest(){
        JavaFXApp test = new JavaFXApp();

        int expected = 2;
        int actual = test.computeDivide(4,2);

        Assertions.assertEquals(expected, actual);

    }
}