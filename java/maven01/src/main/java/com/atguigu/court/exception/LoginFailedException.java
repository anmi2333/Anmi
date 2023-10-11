package com.atguigu.court.exception;

/**
 * @projectName: maven01
 * @package: com.atguigu.court.exception
 * @className: LoginFailedException
 * @NAME: WANG CHAO
 * @date: 2023/08/28 23:13
 */
@SuppressWarnings({"all"})
public class LoginFailedException extends RuntimeException {

    public LoginFailedException() {
    }

    public LoginFailedException(String message) {
        super(message);
    }

    public LoginFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginFailedException(Throwable cause) {
        super(cause);
    }

    public LoginFailedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
