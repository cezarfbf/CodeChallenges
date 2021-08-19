package com.codechallenges.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamsOperations {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,34,6,87,98,8,6,3,5);

        int sum = list.stream()
                .filter(x -> x > 10)
                .mapToInt(x -> x)
                .sum();

        System.out.println(sum);

//        Stream of Collection
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();

//        Stream of Array
        Stream<String> streamOfArray = Stream.of("a", "b", "c");
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

//        Stream.builder()
        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();

//      Stream.generate()
        Stream<String> streamGenerated =
                Stream.generate(() -> "element").limit(10);

//        Stream.iterate()
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);


    }
}
