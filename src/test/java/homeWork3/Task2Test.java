package homeWork3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @ParameterizedTest
    @ValueSource(ints = {1, 25,  40, 100, 105})
    void numberInInterval(int number) {
        Task2 task2 = new Task2(25, 100);
        boolean result = task2.numberInInterval(number);
        assertEquals(number > 25 && number < 100, result, "The number " + number + " > 25 &&" + number +
                " < 100 is not " + result);
    }
}