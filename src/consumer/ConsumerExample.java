package consumer;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static void printNames() {
        var students = StudentDatabase.getStudents();

        students.forEach(stud -> System.out.println(stud.getName().toUpperCase()));
    }

    static void printNamesAndActivities() {
        var students = StudentDatabase.getStudents();

        students.forEach(((Consumer<Student>) stud -> System.out.print(stud.getName().toUpperCase() + " | "))
                .andThen(stud -> System.out.println(stud.getActivities()))
        );
    }

    static void main() {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("Hello");

        printNames();
        printNamesAndActivities();


    }
}
