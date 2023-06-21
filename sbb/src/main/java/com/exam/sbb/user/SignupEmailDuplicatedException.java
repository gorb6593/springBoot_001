package com.exam.sbb.user;

public class SignupEmailDuplicatedException extends RuntimeException {
    public SignupEmailDuplicatedException(String s) {
        super(s);
    }
}
