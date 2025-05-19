package GitPush;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {

    // main method
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1000);
        arr.add(200);
        arr.add(30);
        arr.add(450);
        arr.add(45);
        arr.add(50);
        arr.add(55);
      
    // using collections to sort the list
        // Collections.sort(arr);
        // int largest = arr.get(arr.size() - 1);
        // System.out.println("Largest number: " + largest);
         
        
         int holdNum = arr.get(0);
         System.out.println(holdNum);
        for ( Integer num : arr ) {
            //System.out.println(num);
           if ( num > holdNum ) {
                holdNum = num;
            }   
        }
        
        System.out.println(" the Largest number is : " + holdNum);

    }
    
}
