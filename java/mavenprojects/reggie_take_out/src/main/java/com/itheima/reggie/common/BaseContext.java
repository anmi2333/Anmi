package com.itheima.reggie.common;

/**
 * @projectName: reggie_take_out
 * @package: com.itheima.reggie.common
 * @className: BaseContext
 * @NAME: WANG CHAO
 * @date: 2023/09/16 11:49
 */
@SuppressWarnings({"all"})
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();
    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
