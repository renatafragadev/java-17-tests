package edu.renatafragadev.java.application;

public sealed interface BookCommandHandler<C, R> permits CreateBookCommandHandler {

    R handle(C command);
}
