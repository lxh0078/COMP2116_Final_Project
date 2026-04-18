package com.macao.campus_ai_qa.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public String handle(Exception e) {
        return "AI service malfunction：" + e.getMessage();
    }
}