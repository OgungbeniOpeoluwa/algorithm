import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSwapTest {

    @Test
    void testThatAStringSwapMakesItEqual(){
        String first = "bank";
        String second = "kanb";
        assertTrue(StringSwap.checkASingleStringSwapMakesItEqual(first,second));
    }


    @Test
    void testThatAStringSwapMakesItEqualReturnFalse(){
        String first = "abcd";
        String second = "dcba";
        assertFalse(StringSwap.checkASingleStringSwapMakesItEqual(first,second));
    }


    @Test
    void testThatAStringSwapMakesItEqualReturnTrue(){
        String first = "siyolsdcjthwsiplccjbuceoxmpjgrauocx";
        String second = "siyolsdcjthwsiplccpbuceoxmjjgrauocx";
        assertTrue(StringSwap.checkASingleStringSwapMakesItEqual(first,second));
    }

}