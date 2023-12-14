package org.example;

public class SMSNotifier implements Notifier {
    @Override
    public void notify(String msg) {
        System.out.println("SMS: " + msg);
    }
}
