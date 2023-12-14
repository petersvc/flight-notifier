package org.example;

public class EmailNotifier implements Notifier {
    @Override
    public void notify(String msg) {
        System.out.println("Email: " + msg);
    }
}
