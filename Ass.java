package GitPush;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ass {
    public static void main(String[] args) {
       List<Book> bookArr = new ArrayList<>();
      // Book book = new Book(null, null, 0);
         Scanner scan = new Scanner(System.in);
        //variables to hold books
         String  tittle;
         String author;
         String  ISBN;
        
         // var for logic 
         int operationToPerform;

         while (true) {
             System.out.println("what do you want do?");
             System.out.println("\n1. Add Book\n2. List Books\n3. Remove Book\n4. Exit");
             operationToPerform = scan.nextInt();
             scan.nextLine();

             switch (operationToPerform) {
                case 1: {
                    System.out.println("enter title :");
                    tittle= scan.nextLine();
                    System.out.println("enter author name :");
                    author = scan.nextLine();
                    System.out.println("ISBN number :");
                    ISBN = scan.nextLine();

                    Book book1 = new Book (tittle, author, ISBN);
                    bookArr.add(book1);
                    System.out.println("book added");
                }
                    
                    break;
                case  2: {
                    // print the list of books 
                    // for (int j = 0; j < bookArr.size(); j++) {
                    //     System.out.println(bookArr.get(j));
                        
                    // }
                    //enhanced loop
                      for (Book a_book : bookArr) {
                        System.out.println(a_book);
                      }  
                   
                }
                     break;
                case 3 :{
                    System.out.println("enter book index");
                    int index;
                    index = scan.nextInt();
                    scan.nextLine();
                    // remove book from the list
                    if ( index >= 0 && !bookArr.isEmpty() ) {
                        bookArr.remove(index);
                        System.out.println("book removed");
                    }
                    else {
                        System.out.println("book with the index: " + index + " is not found");
                    }
                        
                    
                }
                    break;

                    case 4 : {
                        System.out.println("exit");
                        scan.close();
                        return;
                    } 
                    
             
                default: System.out.println("no operation for the number entered");
                    break;
             }


            
         }
    }
   
}
