package consumer;

import java.util.function.Function;

public class FunctionExample {
    static Function<Integer, Integer> f = x -> {
        System.out.println("FunctionExample f: " + x);
        return x * 76;
    };
    static Function<Integer, Integer> f2 = x -> {
        System.out.println("FunctionExample f2: " + x);
        return x *2;
    };
    static void main() {

        System.out.println(f.apply(123));
        System.out.println(
                f.andThen(f2).apply(123)
        );
        System.out.println("=".repeat(20));
        System.out.println(
                f.compose(f2).apply(123)
        );

    }
}
