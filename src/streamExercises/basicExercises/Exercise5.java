package streamExercises.basicExercises;

import aboutLamnbda.data.StudentDatabase;

public class Exercise5 {
    static void main() {
        boolean allHaveActivity =
                StudentDatabase.getStudents().stream()
                        .noneMatch(student -> student.getActivities().isEmpty());

        System.out.println(allHaveActivity);
    }
}
