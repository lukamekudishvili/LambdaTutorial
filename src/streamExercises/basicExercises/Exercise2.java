package streamExercises.basicExercises;

import aboutLamnbda.data.Student;
import aboutLamnbda.data.StudentDatabase;

import java.util.List;

public class Exercise2 {
    static void main() {
        List<String> namesInUpperCase =
                StudentDatabase
                        .getStudents()
                        .stream()
                        .map(Student::getName)
                        .map(String::toUpperCase)
                        .toList();
        System.out.println(namesInUpperCase);
    }
}
