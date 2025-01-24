import java.util.Arrays;

public class UniqueValueInArray {


    public static int[] returnUniqueElementInArray(int[] value) {
        int [] array = new int[value.length];
        int counter = 0;
        for (int i = 0; i < value.length; i++) {
            int element = value[i];
            int numberOfTimesValueAppeared = returnNumberOfTimesANumberExistsInArray(value, element);
            System.out.println(numberOfTimesValueAppeared);
            if (numberOfTimesValueAppeared == 1) {
                array[counter] = element;
                counter++;
            }
        }
        return returnArrayWithValue(counter,array);
    }

    private static  int returnNumberOfTimesANumberExistsInArray(int[] value, int number) {
        int count = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == number) {
                count++;
            }
        }
        return count;
    }

    private static  int [] returnArrayWithValue(int length, int []value){
        int [] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = value[i];
        }
        return array;
    }
}
