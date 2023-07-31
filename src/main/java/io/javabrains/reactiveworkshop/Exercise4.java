package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.Optional;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        // TODO: Write code here
        ReactiveSources.intNumberMono().subscribe(number -> System.out.println(number),
                error -> System.out.println(error.getMessage()),
                () -> System.out.println("complete"));

        // Get the value from the Mono into an integer variable
        // TODO: Write code here
//        final Integer number = ReactiveSources.intNumberMono().block();
        final Optional<Integer> number = ReactiveSources.intNumberMono().blockOptional();

        final User foo = ReactiveSources.userMono().block();
        System.out.println("Press a key to end");
        System.in.read();
    }

}
