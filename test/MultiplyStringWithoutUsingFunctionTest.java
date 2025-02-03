import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyStringWithoutUsingFunctionTest {
    @Test
    void returnArrayOfStringCount() {
        String firstValue = "289";
        String secondValue = "3";
        int result = 6;
        assertEquals(result,MultiplyStringWithoutUsingFunction.multiplyString(firstValue,secondValue));
    }

}