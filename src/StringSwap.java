import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class StringSwap {

    public static boolean checkASingleStringSwapMakesItEqual(String first, String second) {
        if(first.length() != second.length())return false;
        if(first.equals(second)) return true;
        for(int i = 0; i < first.length(); i++) {
            char firstValue = first.charAt(i);
            char secondValue = second.charAt(i);
            if (firstValue != secondValue){
                ArrayList<Integer> index = checkForValueInString(firstValue,second);
                for (int n:index) {
                    StringBuilder swap = new StringBuilder(second);
                    swap.setCharAt(i, firstValue);
                    swap.setCharAt(n, secondValue);
                    if (swap.toString().equals(first)) return true;
                }

            }
        }
        return false;
    }

    public static ArrayList<Integer> checkForValueInString(char value,String word) {
        ArrayList<Integer> v = new ArrayList<>();
        if(word.contains(value+"")){
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == value){
                    v.add(i);
                }
            }
        }
        return v;
    }
}
