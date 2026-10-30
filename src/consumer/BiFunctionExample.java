package consumer;

import data.Student;
import data.StudentDatabase;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<Collection<Student>, Predicate<Student>, Map<String, Double>> biFunction =
            (students, studentPredicate) -> {
                Map<String, Double> map = new HashMap<>();
                students.forEach(student -> {
                    if (studentPredicate.test(student)) {
                        map.put(student.getName(), student.getGpa());
                    }
                });
                return map;
            };

    static void main() {
        System.out.println(biFunction.apply(StudentDatabase.getStudents(), (student -> student.getGpa()>3.7)));
    }
}
