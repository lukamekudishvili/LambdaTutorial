package streamExercises.Level2Exercises;

import aboutLamnbda.data.Student;
import aboutLamnbda.data.StudentDatabase;

import java.util.Collection;

public class Exercise7{
    static void main() {
        Collection<Student> top3ByGpa =
                StudentDatabase.getStudents().stream()
                        .sorted((a, b) ->Double.compare(b.getGpa(), a.getGpa()))
                        .limit(3)
                        .toList();

        System.out.println(top3ByGpa.toString());
    }
}
