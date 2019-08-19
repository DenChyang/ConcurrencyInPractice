package cn.jy.concurrency.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 用于标注线程安全的注解
 * @author DengQiang.Wu
 * @create 2019-05-06 20:57
 */
@Target(ElementType.TYPE)
public @interface ThreadSafe {

}
