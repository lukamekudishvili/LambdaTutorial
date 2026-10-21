package consumer;

import data.Student;
import data.StudentDatabase;

import java.util.Collection;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> gradeLevelPredicate = p -> p.getGradeLevel() >= 3;
    static Predicate<Student> gpaPredicate = p -> p.getGpa() >= 3.9;


    public static void filterStudentByGradeLevel(Collection<Student> students) {
        students.forEach(student -> {
            if (gradeLevelPredicate.and(gpaPredicate).test(student)) {
                System.out.println(student.getGradeLevel());
            }
        });
    }

    static void main() {
        filterStudentByGradeLevel(StudentDatabase.getStudents());
    }
}
