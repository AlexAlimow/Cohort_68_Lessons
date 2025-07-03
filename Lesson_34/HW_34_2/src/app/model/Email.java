package app.model;

import app.interfaces.MailDeliveryService;

public class Email implements MailDeliveryService {



    @Override
    public void sendMail() {
        System.out.println("Отправить по Интернету");
    }
}
