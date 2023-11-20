import org.example.Calculator;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class TestCalculator {
    @Test
    public void testAdd() throws Exception{
        Calculator calculator  = new Calculator();
        int add = calculator.add(3,4);
        assertEquals(8, add);

    }
    @Test
    public void testAdd1() throws Exception{
        Calculator calculator  = new Calculator();
        int add = calculator.add(5,6);
        assertEquals(11, add);

    }
    @Test
    public void testAdd2() throws Exception{
        Calculator calculator  = new Calculator();
        int add = calculator.add(20,11);
        assertEquals(31, add);

    }
    @Test
    public void testAdd3() throws Exception{
        Calculator calculator  = new Calculator();
        int add = calculator.add(0,-2);
        assertEquals(-2, add);

    }
}