package consultation_09.code.withCollections;

import consultation_09.code.withCollections.entity.Book;
import consultation_09.code.withCollections.entity.BookAndReader;
import consultation_09.code.withCollections.entity.Reader;
import consultation_09.code.withCollections.repository.BookAndReaderRepository;
import consultation_09.code.withCollections.repository.BookRepository;
import consultation_09.code.withCollections.repository.ReaderRepository;
import consultation_09.code.withCollections.service.BookAndReaderService;
import consultation_09.code.withCollections.service.BookService;
import consultation_09.code.withCollections.service.ReaderService;

public class LibraryApp {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        ReaderRepository readerRepository = new ReaderRepository();
        BookService bookService = new BookService(bookRepository);
        ReaderService readerService = new ReaderService(readerRepository);

        BookAndReaderRepository repository = new BookAndReaderRepository();
        BookAndReaderService service = new BookAndReaderService(repository, bookService);

        for (int i = 0; i < 50; i++) {
            Book newBook = bookService.createBook();
            bookService.addNewBook(newBook);
        }

        for (int i = 0; i < 10; i++) {
            Reader newReader = readerService.createReader();
            readerService.addNewReader(newReader);
        }

        Integer bookId = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {

                BookAndReader newRecord = new BookAndReader(bookId,i+1);
                service.addNewRecord(newRecord);
                bookId++;
            }
        }


        bookService.printInfo();

        readerService.printInfo();

        service.printInfo();

        System.out.println(service.findAllBookFromReader(readerService.findById(10)));
    }
}
