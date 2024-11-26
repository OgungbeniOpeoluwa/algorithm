import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DefuseBombTest {
    @Test
    public void testDecryptFunctionWhenKIsGreaterThan0(){
        int [] input = {5,7,1,4};
        int k = 3;
        int [] expected = {12,10,16,13};
        int [] actual = DefuseBomb.decrypt(input,k);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void testDecryptFunctionWhenKI0(){
        int [] input = {5,7,1,4};
        int k = 0;
        int [] expected = {0,0,0,0};
        int [] actual = DefuseBomb.decrypt(input,k);
        assertArrayEquals(expected,actual);
    }

}