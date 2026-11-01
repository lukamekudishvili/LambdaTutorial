package streamExercises.Level3Exercises;

import aboutLamnbda.data.StudentDatabase;

public class Exercise11 {
    static void main() {
        var allActivitiesNoDupSorted = StudentDatabase.getStudents()
                .stream()
                .flatMap(s -> s.getActivities().stream())
                .distinct()
                .sorted(String::compareToIgnoreCase)
                .toList();

        System.out.println(allActivitiesNoDupSorted);

    }
}
