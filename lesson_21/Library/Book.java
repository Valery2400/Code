package Library;

public class Book extends MediaItem{
    private String genre;
    private int pages;

    public Book(int id, String title, String author, int year, String genre, int pages) {
        super(id, title, author, year);
        this.genre = genre;
        this.pages = pages;
    }



    public String getGenre () {
        return genre;
    }
    public int getPages () {
        return pages;
    }
}
