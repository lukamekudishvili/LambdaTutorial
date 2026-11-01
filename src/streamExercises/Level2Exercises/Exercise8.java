package streamExercises.Level2Exercises;

import aboutLamnbda.data.Student;
import aboutLamnbda.data.StudentDatabase;

import java.util.Comparator;

public class Exercise8 {
    static void main() {
        var lowestGpaStudent = StudentDatabase.getStudents()
                .stream()
                .min(Comparator.comparingDouble(Student::getGpa))
                .orElseThrow(()-> new IllegalArgumentException("Student not found"));
        System.out.println(lowestGpaStudent);
    }
}
