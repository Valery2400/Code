package NewsLine;
//Задача: Лента новостей
//
//Описание: Создайте программу для управления лентой новостей.
// Новые новости должны вставляться в начало, чтобы самые последние новости всегда отображались первыми.
//
//Требования:
//
//Создайте класс News с полями id, title и content.
//Создайте класс NewsFeed, который будет управлять лентой новостей.
//Реализуйте методы для добавления новой новости и отображения всех новостей в ленте.

public class News {
    private Integer id;
    private String title;
    private String content;

    public News(Integer id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
