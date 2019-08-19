package cn.jy.concurrency.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 线程不安全的注解
 * @author DengQiang.Wu
 * @create 2019-05-02 15:16
 */
@Target(ElementType.TYPE)
public @interface NotThreadSafe {

}
