package GitPush;

import java.util.List;

public class Book {
   private String tittle;
   private String Author;
   private String ISBN;

    @Override
    public String toString() {
            return "Title: " + tittle + ", Author: " + Author + ", ISBN: " + ISBN;

    }

    public Book(String tittle, String author, String ISBN){
        this.tittle=tittle;
        this.Author=author;
        this.ISBN=ISBN;
    }
    public String getTittle(String tittle) {
        return tittle;
    }
    public String getAuthor(String author) {
        System.out.println(Author);
         return Author;
    }
    public String getISBNS (String ISBN) {
        return ISBN;
    }
    public void setAuthor(String author) {
        this.Author =  author;
    }
        public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public void setISBN(String ISBN) {
        this.ISBN=ISBN;
    }    
}
