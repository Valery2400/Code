package homework_37.task1;
//Задание: Создайте класс Library, который хранит книги разных жанров.
//Используйте Generics для создания типобезопасной библиотеки, где можно хранить книги различных жанров в соответствующих коллекциях.
//Детали реализации: Класс Book имеет поля String title и поле genre.
//Класс Library должен содержать метод addBook(Book book), который добавляет книгу в соответствующую коллекцию по жанру.
//Также необходим метод List<Book> getBooksByGenre(String genre), который возвращает список книг заданного жанра.
//Хранение книг необходимо организовать к коллекции типа List
//Написать метод для поиска книги по названию
//**) создайте коллекцию жанров, где каждый жанр будет иметь свой порядковый номер и обеспечьте хранение данных о книгах, где жанр имеет свой порядковый номер
public class Book {

    private String title;
    private String genre;

    public Book(String id, String title, String genre) {

        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
