package edu.renatafragadev.java.domain;

import java.time.LocalDate;
import java.util.UUID;

public record Book(BookId bookId,
        String name,
        String isbn,
        LocalDate release,
        Integer editionNumber) {

    public static class BookId {
        private final String id;


        public BookId() {
            this.id = UUID.randomUUID().toString();
        }

        public String getId() {
            return id;
        }
    }
}