package app.model;

import app.interfaces.MailDeliveryService;

public class Sender {
    public void send(MailDeliveryService service) {
        service.sendMail();
    }
}
