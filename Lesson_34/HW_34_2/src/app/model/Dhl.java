package app.model;

import app.interfaces.MailDeliveryService;

public class Dhl implements MailDeliveryService {
    private String postmanName;

    public Dhl(String postmanName) {
        this.postmanName = postmanName;
    }

    public String getPostmanName() {
        return postmanName;
    }


    @Override
    public String toString() {
        return "Dhl{" +
                "postmanName='" + postmanName + '\'' +
                '}';
    }

    @Override
    public void sendMail() {
        System.out.println("«Положи письмо в конверт, поставь марку, отправь»");
    }
}
