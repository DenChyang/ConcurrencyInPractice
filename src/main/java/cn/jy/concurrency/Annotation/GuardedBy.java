package cn.jy.concurrency.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author DengQiang.Wu
 * @create 2019-05-06 20:58
 */
@Target(ElementType.FIELD)
public @interface GuardedBy {

    public String value() default "";
}
