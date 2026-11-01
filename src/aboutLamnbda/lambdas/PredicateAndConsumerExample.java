package aboutLamnbda.lambdas;

import aboutLamnbda.data.Student;
import aboutLamnbda.data.StudentDatabase;

import java.util.Collection;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    static Predicate<Student> predicate = s -> s.getGradeLevel() >= 3;
    static Predicate<Student> predicate2 = s -> s.getGpa() >= 3.9;
    static BiConsumer<String, List<String>> biConsumer = (a, b) -> System.out.println(a + " | " + b);

    static Consumer<Student> studentConsumer = s -> {
        if (predicate.and(predicate2).test(s)) {
            biConsumer.accept(s.getName(), s.getActivities());
        }
    };

    public static void printNameAndActivities(Collection<Student> students) {
        students.forEach(s -> studentConsumer.accept(s));
    }

    static void main() {
        var students = StudentDatabase.getStudents();
        printNameAndActivities(students);
    }
}
