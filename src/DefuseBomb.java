import java.util.Arrays;

public class DefuseBomb {

    public static int[] decrypt(int[] input, int k) {
        int [] response = new int[input.length];
        for(int i = 0; i < input.length; i++) {
            if(k >0){
                response[i] = getNextSumOfK(input,k,i+1);
            }
            if(k==0){
                return response;
            }
        }
        return response;
    }

    public  static int getNextSumOfK(int [] input,int k,int start){
        int count = 0;
        int total = 0;
        while (count < k){
            if (start > input.length-1){
                start = 0;
            }
            total += input[start];
            start++;
            count++;
        }
        return total;
    }
}
