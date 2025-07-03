package app;

import app.interfaces.MailDeliveryService;
import app.model.Dhl;
import app.model.Email;
import app.model.Pigeon;
import app.model.Sender;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Sender sender = new Sender();

        System.out.println("Как вы хотите отправить почту? 1.DHL 2.Email 3.Голубями");
        int choice = scanner.nextInt();

        MailDeliveryService service;

        Dhl postMan = new Dhl("Вася");

        switch (choice){
            case 1:
                service = postMan; break;
            case 2: service = new Email();break;
            case 3: service = new Pigeon();break;
            default:
                System.out.println("Неверный выбор, DHL почта используется по умолчанию");
                service = postMan;
        }
        sender.send(service);

    }
}
/*
Задача 2.  Mail Delivery
Создать интерфейс MailDeliveryService с одним методом void sendMail().
Создайте класс DHL, который должен реализовать интерфейс MailDeliveryService.
Его способ отправки почты — напечатать что-то вроде: «Положи письмо в конверт, поставь марку, отправь».
Создайте класс Email, который должен реализовать интерфейс MailDeliveryService.
Его способ отправки почты - напечатать что-то вроде: «Отправить по Интернету».
Создайте класс Pigeon, который должен реализовать интерфейс MailDeliveryService.
Его способ отправки почты — напечатать что-то вроде:
«Голубь?! Серьезно!? в двадцать первом веке?!!! Ты сумасшедший! Я улетаю»
Создайте класс Sender. Реализуйте в нем метод send(),
который в качестве аргумента принимает MailDeliveryService и отправляет почту с помощью данной службы.
Реализуйте диалог с пользователем (использовать Scanner),
как отправлять почту и отправлять ее с помощью Sender.
 */