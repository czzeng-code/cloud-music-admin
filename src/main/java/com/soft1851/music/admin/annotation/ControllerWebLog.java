package com.soft1851.music.admin.annotation;

import java.lang.annotation.*;

/**
 * @author ZENG
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ControllerWebLog {
    /**
     * 调用接口名称
     * @return String
     */
    String name();

    /**
     * 标识该日志是否需要持久化存储
     * @return boolean
     */
    boolean isSaved() default false;
}
