package com.example.oauth.common.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    // User
    DUPLICATE_USERNAME(HttpStatus.CONFLICT, "이미 사용중인 아이디입니다."),
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "존재하지 않는 사용자입니다."),
    INVALID_PASSWORD(HttpStatus.UNAUTHORIZED, "비밀번호가 일치하지 않습니다."),

    // Post
    POST_NOT_FOUND(HttpStatus.NOT_FOUND, "존재하지 않는 게시글입니다."),
    UNAUTHORIZED_POST(HttpStatus.FORBIDDEN, "게시글 작성자만 가능합니다.");

    private final HttpStatus status;
    private final String message;
}