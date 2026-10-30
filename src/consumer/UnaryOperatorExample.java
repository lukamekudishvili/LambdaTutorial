package consumer;

import java.util.Comparator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    static UnaryOperator<String> unaryOp = s -> s.concat("Default");

    public static void main(String[] args) {

        Comparator<String> comparator = Comparator.naturalOrder();

    }
}
