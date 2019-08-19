package cn.jy.concurrency.ch3.core;

import javafx.event.Event;

import java.util.EventListener;

/**
 * @author DengQiang.Wu
 * @create 2019-05-12 19:18
 */
public class SafeListener {
    private final EventListener listener;

    private SafeListener() {
        listener = new EventListener() {
            public void onEvent(Event e) {
                System.out.println(e);
            }
        };
    }

    public static SafeListener newInstance(EventSource source) {
        SafeListener safe = new SafeListener();
        source.registerListener(safe.listener);
        return safe;
    }

    ThreadLocal
}
