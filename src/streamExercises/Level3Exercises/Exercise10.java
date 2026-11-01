package streamExercises.Level3Exercises;

import aboutLamnbda.data.StudentDatabase;

public class Exercise10 {
    static void main() {
        var allActivities = StudentDatabase.getStudents()
                .stream()
                .flatMap(s -> s.getActivities().stream())
                .toList();

        System.out.println(allActivities);
    }
}
