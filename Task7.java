package GitPush;

public class Task7 {
     

    public static void main(String[] args) {
      // number to convert
       int num = 200;
       // String to reverse
       String s = "Hello world";
       
       // converting to String
       String convertedNum = Integer.toString(num);
       System.out.println("this is the number converted to a string: " + convertedNum);
       // converting back to int
       int convertedBackNum = Integer.parseInt(convertedNum);
        System.out.println("this is the number converted back to integer: " + convertedBackNum);
       
        // reversing the string
        String theReversed = new StringBuilder(s).reverse().toString();
        System.out.println("the reversed Hello world is: " + theReversed);
    }


}
