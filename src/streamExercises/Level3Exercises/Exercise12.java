package streamExercises.Level3Exercises;

import aboutLamnbda.data.StudentDatabase;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise12 {
    static void main() {
        long swimmingStudCount = StudentDatabase.getStudents()
                .stream()
                .flatMap(s -> s.getActivities().stream())
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(kv -> kv.getKey().equalsIgnoreCase("swimming"))
                .map(Map.Entry::getValue).findFirst()
                .orElseThrow(() -> new AssertionError("swimming student not found"));

        System.out.println(swimmingStudCount);
    }
}
