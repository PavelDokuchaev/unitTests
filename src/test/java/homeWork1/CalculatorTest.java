package homeWork1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    static void setup() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @AfterEach
    void cleanup() {
        calculator = null;
    }

    @AfterAll
    static void teardown() {
        System.out.println("After all tests");
    }

    @Test
    @DisplayName("Рсчет скидки")
    void testCalculateDiscount(){
        double result = calculator.calculateDiscount(300,30);
        assertEquals(210, result, "Цена 300 после вычета скидки 30% должна составлять 210");
    }

    @Test
    @DisplayName("Проверка на превышение допустимого процента скидки")
    void testWrongPercentages(){
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(300, 110),
                "Если процент скидки больше 100%, выбрасывается ArithmeticException");
    }

    @Test
    @DisplayName("Test negative purchase amount")
    void testNegativeAmount(){
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(-300, 30),
                "При отрицательной сумме покупок выбрасывается ArithmeticException");
    }
}