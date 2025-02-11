package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        StreamSources.intNumbersStream().filter(number -> number > 5)
                .skip(1).limit(2).forEach(System.out::println);

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        final Integer value = StreamSources.intNumbersStream().filter(number -> number > 5)
                .findFirst().orElse(-1);
        System.out.println(value);

        // Print first names of all users in userStream
        // TODO: Write code here

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        StreamSources.intNumbersStream().flatMap(id -> StreamSources.userStream().filter(user -> user.getId() == id))
                .map(user -> user.getFirstName())
                .forEach(System.out::println);

        StreamSources.userStream().filter(u -> StreamSources.intNumbersStream()
                .anyMatch(i -> i == u.getId())).forEach(System.out::println);


    }

}
