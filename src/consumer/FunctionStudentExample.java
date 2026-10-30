package consumer;

import data.Student;
import data.StudentDatabase;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {
    static Function<Collection<Student>, Map<String, Double>> studentFunction =
            students -> {
                Map<String, Double> studentGradeMap = new HashMap<>();
                for (Student student : students) {
                    studentGradeMap.put(student.getName(), student.getGpa());
                }

                return studentGradeMap;
            };

    static void main() {
        System.out.println(studentFunction.apply(StudentDatabase.getStudents()));
    }
}
