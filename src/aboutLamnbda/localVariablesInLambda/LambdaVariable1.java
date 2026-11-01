package aboutLamnbda.localVariablesInLambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaVariable1 {
    static int k = 0;

    static Supplier<Integer> makeSupplier() {
        int base = 5;
        return () -> base + 1;
    }

    static void main() {
        int k1 = 0;

        Consumer<Integer> c1 = (i) -> {
            k++;
            System.out.println("value is : " + k1 + i);
        };
    }
}
