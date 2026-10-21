package consumer;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> positivePredicate = (a -> a > 0);
    static Predicate<Integer> evenPredicate = (a -> a % 2 == 0);
    static Predicate<Integer> positiveAndEvenPredicate = positivePredicate.and(evenPredicate);
    static Predicate<Integer> positiveOrEvenPredicate = positivePredicate.or(evenPredicate);
    static Predicate<Integer> negativePredicate = positiveAndEvenPredicate.negate();

    static void main() {

        System.out.println("positiveAndPredicate = " + negativePredicate.test(10));
    }
}
