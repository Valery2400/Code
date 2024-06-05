package homework_32.task1.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsDemo {
    public static void main(String[] args) {

        ArrayList<Subject> subjectsList = new ArrayList<>();

        Student student1 = new Student("John Smith");
        Student student2 = new Student("Alex Biden");
        Student student3 = new Student("Elon Mask");
        Student student4 = new Student("Donald Duck");
        Student student5 = new Student("Kate Moss");
        Student student6 = new Student("Maria Mirabella");

        subjectsList.add(new Subject("Math",5.0));
        subjectsList.add(new Subject("Music", 5.0));

        Map<String, List<Subject>> listOfStudents = new HashMap<>();

        listOfStudents.put(student1.getName(),subjectsList);
        listOfStudents.put(student2.getName(),subjectsList);
        listOfStudents.put(student3.getName(),subjectsList);
        listOfStudents.put(student4.getName(),subjectsList);
        listOfStudents.put(student5.getName(),subjectsList);
        listOfStudents.put(student5.getName(),subjectsList);
        listOfStudents.put(student6.getName(),subjectsList);

        System.out.println(listOfStudents);











    }




}