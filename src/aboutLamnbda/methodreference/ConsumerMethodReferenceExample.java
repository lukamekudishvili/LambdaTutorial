package aboutLamnbda.methodreference;

import aboutLamnbda.data.Student;
import aboutLamnbda.data.StudentDatabase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> consumer = System.out::println;

    static void main() {
        var students = StudentDatabase.getStudents();

        students.forEach(consumer);
    }
}
