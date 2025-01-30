package org.app.graphql.models;


import java.util.Arrays;
import java.util.List;

public record Book(Integer id,
                   String name,
                   Integer pageCount) {
    public static List<Book> books = Arrays.asList(
            new Book(1, "Harry Potter and the Philosopher's Stone J. K. Rowling",580),
            new Book(2, "Harry Potter and the Chamber of Secrets J. K. Rowling",420)
    );
}
