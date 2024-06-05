package Library;

public class Magazine extends MediaItem{
    private int issueNumber;

    public Magazine(int id, String title, String author, int year, int issueNumber) {
        super(id, title, author, year);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}
