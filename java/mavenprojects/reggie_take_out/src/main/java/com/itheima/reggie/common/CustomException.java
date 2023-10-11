package com.itheima.reggie.common;

/**
 * @projectName: reggie_take_out
 * @package: com.itheima.reggie.common
 * @className: CustomException
 * @NAME: WANG CHAO
 * @date: 2023/09/16 15:59
 */
@SuppressWarnings({"all"})
public class CustomException extends RuntimeException{
    public CustomException(String message) {
        super(message);
    }
}
