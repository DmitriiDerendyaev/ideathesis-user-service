package ru.derendyaev.ideathesis_user_service.exception;

public class ObjectAlreadyExistException extends RuntimeException {
    public ObjectAlreadyExistException(String message) {
        super(message);
    }
}