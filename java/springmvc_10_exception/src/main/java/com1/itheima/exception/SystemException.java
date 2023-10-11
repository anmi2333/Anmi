package com1.itheima.exception;

/**
 * @projectName: springmvc_01_quickstart
 * @package: com.itheima.exception
 * @className: SystemException
 * @NAME: WANG CHAO
 * @date: 2023/09/05 10:54
 */
@SuppressWarnings({"all"})
public class SystemException extends RuntimeException{
    private Integer cede;

    public Integer getCede() {
        return cede;
    }

    public void setCede(Integer cede) {
        this.cede = cede;
    }

    public SystemException(Integer cede , String message) {
        super(message);
        this.cede = cede;
    }

    public SystemException(Integer cede, String message, Throwable cause) {
        super(message, cause);
        this.cede = cede;
    }
}
