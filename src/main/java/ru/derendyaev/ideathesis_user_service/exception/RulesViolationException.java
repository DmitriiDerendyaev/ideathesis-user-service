package ru.derendyaev.ideathesis_user_service.exception;

public class RulesViolationException extends RuntimeException {
    public RulesViolationException(String message) {
        super(message);
    }
}
