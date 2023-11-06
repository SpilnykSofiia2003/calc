import org.junit.Test;
import org.example.Calculator;
import org.junit.Assert;

public class TestCalculator {
    @Test
    public void testAdd() throws Exception{
        Calculator calculator  = new Calculator();
        int add = calculator.add(3,4);
        Assert.assertEquals(7, add);

    }
}