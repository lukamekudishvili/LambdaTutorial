package streamExercises.basicExercises;

import aboutLamnbda.data.StudentDatabase;

public class Exercise4 {
    static void main() {
        boolean anyoneGpaBelow2 =
                StudentDatabase.getStudents()
                        .stream()
                        .anyMatch(s -> s.getGpa() < 2.0);

        System.out.println(anyoneGpaBelow2);
    }
}
