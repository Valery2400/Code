package homework_32.task1.task1;

import java.util.Objects;

public class Subject {
    private String titleSubject;
    private  Double grade;

    public Subject(String titleSubject, Double grade) {
        this.titleSubject = titleSubject;
        this.grade = grade;
    }

    public String getTitleSubject() {
        return titleSubject;
    }

    public Double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "titleSubject='" + titleSubject + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(titleSubject, subject.titleSubject) && Objects.equals(grade, subject.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleSubject, grade);
    }
}
