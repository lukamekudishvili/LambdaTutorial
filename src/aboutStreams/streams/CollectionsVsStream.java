package aboutStreams.streams;

import aboutLamnbda.data.Student;

import java.util.ArrayList;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class CollectionsVsStream {
    static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("jenny");

        for (String name : names) {
            System.out.println(name);
        }

        for (String name : names) {
            System.out.println(name);
        }

        names.remove("adam");
        System.out.println(names);

        Stream<String> namesStream = names.stream();
        namesStream.forEach(System.out::println);

        namesStream.forEach(System.out::println);


    }
}
