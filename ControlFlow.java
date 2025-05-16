package GitPush;

import java.util.Random;
import java.util.Scanner;

public class ControlFlow {

    //main method 
    public static void main(String[] args) {
        Random randomNum = new Random();
        int randomInt = randomNum.nextInt(50);
        System.out.println("Random number: " + randomInt);
        Scanner scan = new Scanner(System.in);
         int guessDigit = 0;
         int attempts = 0;
        
         System.out.println("let  play  a game");
         System.out.println("Guess a number between 0 and 50");
         
         
         do{
             System.out.println("Enter your guess: ");
               guessDigit = scan.nextInt();
             
            if (guessDigit > randomInt) {
                attempts++;
                System.out.println("Your guess is too high");
          
               
            } if (guessDigit < randomInt) {
                attempts++;
                System.out.println("Your guess is too low");
             
            } if (guessDigit == randomInt) {
                attempts++;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                 
            }
        }
          while (guessDigit != randomInt);
          scan.close();
    }
}
