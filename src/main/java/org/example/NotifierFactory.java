package org.example;

public class NotifierFactory {
    public static Notifier create(int notifierType) {
        return switch (notifierType) {
            case 1 -> new SMSNotifier();
            case 2 -> new EmailNotifier();
            case 3 -> new PushNotifier();
            default -> throw new IllegalArgumentException("Notificação não reconhecida: " + notifierType);
        };
    }
}
