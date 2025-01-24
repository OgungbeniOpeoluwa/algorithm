import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class UniqueValueInArrayTest {
    @Test
    void returnUniqueValueInArray() {
        int [] value = {1,2,3,4,3,5};
        int [] expected = {1,2,4,5};
        assertArrayEquals(expected, UniqueValueInArray.returnUniqueElementInArray(value));
    }
    @Test
    void returnUniqueValueWithZeroInArray() {
        int [] value = {1,2,0,4,3,5,0};
        int [] expected = {1,2,4,3,5};
        assertArrayEquals(expected, UniqueValueInArray.returnUniqueElementInArray(value));
    }

}