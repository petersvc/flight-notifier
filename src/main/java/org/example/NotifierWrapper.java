package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class NotifierWrapper implements Notifier {
    private final List<Notifier> wrapper = new ArrayList<>();

    public void notify(String msg) {
        for (Notifier notifier : this.wrapper) {
            notifier.notify(msg);
        }
    }

    public void add(Notifier notifier) {
        if (this.wrapper.contains(notifier)) {
            throw new IllegalArgumentException("Notifier already exists");
        }
        this.wrapper.add(notifier);
    }

    public void remove(String notifierClass) {
        for (Notifier notifier : this.wrapper) {
            if (notifier.getClass().getName().equalsIgnoreCase(notifierClass)) {
                this.wrapper.remove(notifier);
                break;
            }
        }
    }
}
