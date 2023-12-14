package org.example;

public class NotifierFactory {
    public static Notifier getNotifier(String notifierType) {
        return switch (notifierType) {
            case "1" -> new SMSNotifier();
            case "2" -> new EmailNotifier();
            case "3" -> new PushNotifier();
            default -> null;
        };
    }
}
