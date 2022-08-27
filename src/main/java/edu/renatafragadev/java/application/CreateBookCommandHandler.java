package edu.renatafragadev.java.application;

import edu.renatafragadev.java.domain.Book;

public class CreateBookCommandHandler implements BookCommandHandler<, Book.BookId> {

    @Override
    public Book.BookId handle(Book command) {
        return null;
    }
}
