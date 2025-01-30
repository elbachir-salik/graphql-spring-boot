package org.app.graphql.models;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id,
                     String name) {
    public static List<Author> authors = Arrays.asList(
            new Author(1, "J. K. Rowling"),
            new Author(2, "Sun Tzu")
    );

    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream()
                .filter(b ->b.id.equals(id))
                .findFirst();
    }
}
