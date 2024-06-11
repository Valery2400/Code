package homework_42.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Задача 2: Группировка элементов и подсчёт количества
//Задание: Дан список объектов сотрудников (Employee),
// где каждый объект содержит имя и отдел, в котором работает сотрудник.
// Необходимо сгруппировать сотрудников по отделам и подсчитать количество сотрудников в каждом отделе.
public class GroupAndCalculate {
    public static void main(String[] args) {
        List <Employee> employees= new ArrayList<>();
        employees.add(new Employee("Aaron", "Management"));
        employees.add(new Employee("Arnold", "Sales"));
        employees.add(new Employee("Alex", "IT"));
        employees.add(new Employee("Bill", "IT"));
        employees.add(new Employee("John", "IT"));
        employees.add(new Employee("Sandra", "Sales"));
        employees.add(new Employee("Dina", "Management"));

        employees.forEach(System.out::println);



    }
}
