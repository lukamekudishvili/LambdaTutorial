package aboutLamnbda.lambdas;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    static void main() {
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a: " + a + ", b: " + b);
        biConsumer.accept("java", "cool");

        BiConsumer<Integer, Integer> multiplicationBiConsumer = (a, b) -> System.out.println("a X b = " + a * b);
        multiplicationBiConsumer.accept(6, 9);

        BiConsumer<Integer, Integer> divideBiConsumer = (a, b) -> System.out.println("a / b = " + a / b);
        multiplicationBiConsumer.andThen(divideBiConsumer).accept(10, 20);

    }
}
