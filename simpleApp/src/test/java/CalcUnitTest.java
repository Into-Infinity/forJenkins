import org.junit.jupiter.api.*;
import static org.example.SimpleCalc.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalcUnitTest {

    @Test
    @DisplayName("Add two numbers")
    @Order(1)
    void testCalcAdd()
    {
        Assertions.assertEquals( 4 , add(2, 2));
        System.out.println("=======testCalcAdd EXECUTED=======");
    }

    @Test
    @DisplayName("Difference between numbers")
    @Order(2)
    void testCalcSubtract()
    {
        Assertions.assertEquals( 0 , subtract(2, 2));
        System.out.println("=======testCalcSubtract EXECUTED=======");
    }

    @Test
    @DisplayName("Multiply two numbers")
    @Order(3)
    void testCalcMultiply()
    {
        Assertions.assertEquals( 4 , multiply(2, 2));
        System.out.println("=======testCalcMultiply EXECUTED=======");
    }

    @Test
    @DisplayName("Divide two numbers")
    @Order(4)
    void testCalcDivide()
    {
        Assertions.assertEquals( 0 , divide(2, 2));
        System.out.println("=======testCalcDivide EXECUTED=======");
    }

}
