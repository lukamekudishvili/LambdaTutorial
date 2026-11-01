package streamExercises.basicExercises;

import aboutLamnbda.data.Student;
import aboutLamnbda.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    static void main() {
        List<String> names =
                StudentDatabase
                        .getStudents()
                        .stream()
                        .filter(s -> s.getGpa() >= 3.5)
                        .map(Student::getName)
                        .toList();
        System.out.println(names);
    }
}
