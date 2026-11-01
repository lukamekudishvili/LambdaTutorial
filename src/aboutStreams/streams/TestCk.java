package aboutStreams.streams;

import java.util.List;
import java.util.stream.Stream;

public class TestCk {
    static void main() {
        Stream.of("a", "bb", "ccc", "dd")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.length() >= 2;
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }
}
