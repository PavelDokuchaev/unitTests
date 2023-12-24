package homeWork3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 4, -100, -101})
    void evenOddNumber(int number) {
        Task1 task1 = new Task1();
        boolean result = task1.evenOddNumber(number);
        assertEquals(number % 2 == 0, result, number % 2 + " == 0 is not " + result);
    }
}