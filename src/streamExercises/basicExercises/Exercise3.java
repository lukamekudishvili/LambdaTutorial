package streamExercises.basicExercises;

import aboutLamnbda.data.StudentDatabase;

public class Exercise3 {
    static void main() {
        long count =
                StudentDatabase
                        .getStudents()
                        .stream()
                        .filter(s -> s.getGradeLevel() >= 3)
                        .count();
        System.out.println(count);
    }
}
