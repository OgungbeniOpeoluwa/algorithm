import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReturnPrimeInArrayTest {
    @Test
    public void TestReturnPrimeInArray() {
        int number = 16;
        int [] actual = new int [] {2,3,5,7,11,13};
        int [] expected = ReturnPrimeInArray.getPrime(number);
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, actual);
    }

}