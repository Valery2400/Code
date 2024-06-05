package lesson_37.code.practice.libraryGenerics;

public abstract class Genre {
    String name;

    public Genre(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "name='" + name + '\'' +
                '}';
    }
}
