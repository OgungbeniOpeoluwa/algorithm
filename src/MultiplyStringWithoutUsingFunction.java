public class MultiplyStringWithoutUsingFunction {

    public static int multiplyString(String firstValue, String secondValue) {
      char val = 0;
      for (int i = 0; i < firstValue.length(); i++) {
          val -= (char) (firstValue.charAt(i)-'0');
          System.out.println(firstValue.charAt(i)-'0'+val);
      }
        System.out.println(val);
      return  0;
    }
}
