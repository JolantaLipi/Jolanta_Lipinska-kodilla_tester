package com.kodilla.mockito;

import com.kodilla.mockito.notification.Client;

public class NotificationService {

    private Client client;

    public void addSubscriber(Client client) {

    }

    public void sendNotification(Notification notification) {
        this.client.receive(notification);
    }
}