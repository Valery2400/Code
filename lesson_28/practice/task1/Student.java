package homework_32.task1.task1;
//Есть список студентов и у каждого студента есть годовая оценка по различным предметам
// (один предмет - одна оценка)
//
//Написать программу, которая принимает данные об оценках студентов и предоставляет
//возможность получать данные об оценках конкретного студента

import java.util.Objects;

public class Student {
    private String name;
    
    public Student(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}

