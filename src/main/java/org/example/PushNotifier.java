package org.example;

public class PushNotifier implements Notifier {
    @Override
    public void notify(String msg) {
        System.out.println("Push notification: " + msg);
    }
}
