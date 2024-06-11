package homework_37.task1;

import java.util.*;

public class Library {
 private Map<String, List<Book>> booksByGenre;

 public Library(){
     booksByGenre = new HashMap<>();
 }

 public void addBook(Book book) {
     List<Book> books = booksByGenre.get(book.getGenre());
     if (books == null) {
         books = new ArrayList<>();
         booksByGenre.put(book.getGenre(),books);
     }
     books.add(book);
 }



}
