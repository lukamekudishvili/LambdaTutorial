package aboutStreams.streams;

import aboutLamnbda.data.Student;
import aboutLamnbda.data.StudentDatabase;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    static Predicate<Student> filterGrade = s -> s.getGradeLevel() >= 3;
    static Predicate<Student> filterGpa = s -> s.getGpa() >= 3.9;

    static void main() {
        var students = StudentDatabase.getStudents();
        var mapOFStudentAndActivities =
                students.stream()
                        .filter(filterGrade.and(filterGpa))
                        .collect(Collectors.toMap(
                                (Student::getName),
                                Student::getActivities
                        ));

        System.out.println(mapOFStudentAndActivities);
    }
}
