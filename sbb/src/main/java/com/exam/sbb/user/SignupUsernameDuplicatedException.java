package com.exam.sbb.user;

public class SignupUsernameDuplicatedException extends RuntimeException {
    public SignupUsernameDuplicatedException(String s) {
        super(s);
    }
}
