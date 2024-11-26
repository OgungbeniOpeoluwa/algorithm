import java.util.Arrays;

public class ReturnPrimeInArray {

    public static int[] getPrime(int input) {
        int arrayLength = 0;
        int [] result = new int[arrayLength];
        int count = 0;
        for(int i = 2;i < input;i++) {
            if (isNumberIsPrime(i)) {
                arrayLength++;
                result = Arrays.copyOf(result, arrayLength);
                result[count] = i;
                count++;

            }


        }
        return result;
    }


    private static boolean isNumberIsPrime(int input){
        int firstNumber = 2;
        for (int i = firstNumber; i < input; i++) {
            if (input % i == 0){
                return false;
            }
        }
        return true;
    }
}

