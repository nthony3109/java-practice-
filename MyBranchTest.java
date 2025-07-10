package GitPush;

import java.util.Scanner;

public class MyBranchTest {
   public static void main(String[] args) {
     int num;
    Scanner scan = new Scanner(System.in);

    System.out.println("enter number to check");
    num = scan.nextInt();

    if (num != 0) {
        System.out.println(num);
    }
   }
}
