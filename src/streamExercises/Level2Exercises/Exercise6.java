package streamExercises.Level2Exercises;

import aboutLamnbda.data.Student;
import aboutLamnbda.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;

public class Exercise6 {
    static void main() {
        List<String> namesSortedByGpa =
                StudentDatabase.getStudents()
                        .stream()
                        .sorted(Comparator.comparingDouble(Student::getGpa).reversed())
                        .map(Student::getName).toList();

        System.out.println(namesSortedByGpa);
    }
}
