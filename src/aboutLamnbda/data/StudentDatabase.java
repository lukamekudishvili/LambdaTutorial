package aboutLamnbda.data;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StudentDatabase {
    public static Collection<Student> getStudents() {
        Student student1 = new Student("Adam", 2, 3.2, "male", List.of("football", "swimming"));
        Student student2 = new Student("Jenny", 2, 3.85, "female", List.of("basketball", "volleyball"));
        Student student3 = new Student("Emily", 3, 3.9, "female", List.of("swimming", "gymnastics"));
        Student student4 = new Student("Dave", 3, 3.9, "male", List.of("football", "basketball"));
        Student student5 = new Student("Sophia", 4, 3.5, "female", List.of("tennis", "swimming"));
        Student student6 = new Student("James", 4, 3.2, "male", List.of("football", "tennis"));

        return Arrays.asList(student1, student2, student3, student4, student5, student6);
    }
}
