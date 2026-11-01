package aboutLamnbda.constructorReference;

import aboutLamnbda.data.Student;

import java.util.function.Supplier;

public class SupplierConstructorReferenceExample {
    static void main() {
        Supplier<Student> studentSupplier = Student::new;
        var st = studentSupplier.get();
    }
}
