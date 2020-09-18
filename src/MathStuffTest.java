
import static org.junit.Assert.*;

public class MathStuffTest {

    @org.junit.Test
    public void add() {
        System.out.println("Testing adding 1 and 2");
        assertEquals(MathStuff.add(1, 2), 3);
    }

    @org.junit.Test
    public void divide() {
        assertEquals(MathStuff.divide(1, 0), -1);
    }

    @org.junit.Test
    public void pow() {
    }
}