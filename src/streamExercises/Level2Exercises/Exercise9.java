package streamExercises.Level2Exercises;

import aboutLamnbda.data.Student;
import aboutLamnbda.data.StudentDatabase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Exercise9 {
    static void main() {
        var sorted = StudentDatabase.getStudents().stream()
                .sorted(Comparator.comparingInt(Student::getGradeLevel)
                        .thenComparing(Student::getName)).toList();

        System.out.println(sorted);
    }
}
