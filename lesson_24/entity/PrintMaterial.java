package entity;

public abstract class PrintMaterial {
    private int id;
    private String title;

    public PrintMaterial(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "PrintMaterial{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
