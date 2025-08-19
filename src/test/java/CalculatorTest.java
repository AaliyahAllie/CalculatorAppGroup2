
import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calc = new Calculator();

    @Test
    void testAdd(){
        assertEquals(5, calc.add(2,3));
        assertEquals(-1, calc.add(-2,1));
    }
    @Test
    void testSubtract(){
        assertEquals(3, calc.subtract(5,2));
        assertEquals(-3, calc.subtract(2,5));
    }
    @Test
    void testMultiply(){
        assertEquals(6, calc.multiply(2,3));
        assertEquals(0, calc.multiply(0,5));
    }
    @Test
    void testDivide(){
        assertEquals(2.0, calc.divide(6,3));
    }
    @Test
    void testDivideByZero(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            calc.divide(5,0);
        });
        assertEquals("Divide by zero IS NOT POSSIBLE", exception.getMessage());
    }
}