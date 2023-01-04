package com.oraclecompany.bbanggle.global.error.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    // 인증
    ACCESS_TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, "A-001", "Access 토큰이 만료되었습니다."),
    NOT_VALID_TOKEN(HttpStatus.UNAUTHORIZED, "A-002", "해당 토큰은 유효한 토큰이 아닙니다."),
    NOT_EXISTS_AUTHORIZATION(HttpStatus.UNAUTHORIZED, "A-003", "Authorization Header가 빈값입니다."),
    NOT_VALID_BEARER_GRANT_TYPE(HttpStatus.UNAUTHORIZED, "A-004", "인증 타입이 Bearer 타입이 아닙니다."),
    NOT_VALID_KAKAOAK_GRANT_TYPE(HttpStatus.UNAUTHORIZED, "A-004", "인증 타입이 KakaoAK 타입이 아닙니다."),
    REFRESH_TOKEN_NOT_FOUND(HttpStatus.UNAUTHORIZED, "A-005", "해당 Refresh Token은 존재하지 않습니다."),
    REFRESH_TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, "A-006", "해당 Refresh Token은 만료되었습니다."),
    NOT_ACCESS_TOKEN_TYPE(HttpStatus.UNAUTHORIZED, "A-007", "해당 토큰은 Access Token이 아닙니다."),
    FORBIDDEN_ADMIN(HttpStatus.FORBIDDEN, "A-008" , "관리자가 아닙니다."),

    // 회원
    INVALID_MEMBER_TYPE(HttpStatus.BAD_REQUEST, "M-001", "잘못된 회원 타입입니다.(memberType : KAKAO)"),
    ALREADY_REGISTERED_MEMBER(HttpStatus.BAD_REQUEST, "M-002", "이미 가입된 회원입니다."),
    MEMBER_NOT_FOUND(HttpStatus.BAD_REQUEST, "M-003", "해당 회원은 존재하지 않습니다."),
    NOT_EXISTS_TERMS(HttpStatus.BAD_REQUEST, "M-004", "해당 약관이 존재하지 않습니다."),
    TERMS_AGREE_REQUIRED(HttpStatus.BAD_REQUEST, "M-005", "필수약관에 동의해주세요."),
    EXIST_NICKNAME(HttpStatus.BAD_REQUEST, "M-006", "이미 존재하는 닉네임입니다."),

    // 주문
    NOT_EXIST_ORDER(HttpStatus.BAD_REQUEST , "O-001", "존재하지 않는 주문입니다."),
    NOT_EXIST_ORDER_ITEM(HttpStatus.BAD_REQUEST, "O-002", "존재하지 않는 주문상품입니다."),

    // 상품
    NOT_EXIST_PRODUCT(HttpStatus.BAD_REQUEST, "P-001", "존재하지 않는 상품입니다."),
    INVALID_PRODUCT_QUANTITY(HttpStatus.BAD_REQUEST, "P-002", "수량의 범위는 0부터 99입니다."),
    NOT_EXIST_PRODUCT_OPTION(HttpStatus.BAD_REQUEST, "P-003", "존재하지 않는 상품옵션입니다."),
    NOT_EXIST_PRODUCT_OPTION_ITEM(HttpStatus.BAD_REQUEST, "P-004", "존재하지 않는 상품하위옵션입니다."),

    // 상점,
    NOT_EXIST_STORE(HttpStatus.BAD_REQUEST, "S-001", "존재하지 않는 상점입니다.");



    ErrorCode(HttpStatus httpStatus, String errorCode, String message) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.message = message;
    }

    private final String errorCode;
    private final HttpStatus httpStatus;
    private final String message;
}