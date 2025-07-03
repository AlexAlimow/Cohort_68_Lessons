package app;

import app.interfaces.Vehicle;
import app.model.Bike;
import app.model.Boat;
import app.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bike cityBike = new Bike("Fiido","Городской");
        Bike mountainBike = new Bike("Cube","Горный");
        Car myCar1 = new Car("BMW","5er",2025);
        Car myCar2 = new Car("Audi","A5",2025);
        Boat myBoat = new Boat("Poseidon",6000);

        List<Vehicle> myVehicles = new ArrayList<>();
        myVehicles.add(cityBike);
        myVehicles.add(mountainBike);
        myVehicles.add(myCar1);
        myVehicles.add(myCar2);
        myVehicles.add(myBoat);

        cityBike.drive();
        myBoat.drive();
        myBoat.stop();
        myCar1.drive();
        myCar1.stop();


        driveAll(myVehicles);
        stopAll(myVehicles);


    }
    public static void letsDrive (Vehicle vehicle){
        vehicle.drive();
    }
    public static void letsStop(Vehicle vehicle){
        vehicle.stop();
    }

    public static void driveAll(List<Vehicle> list){
        System.out.println("----------Все поехали----------");
        for (Vehicle vehicle : list){
            System.out.println("---------" + vehicle.getType().toUpperCase() + "---------");
            vehicle.drive();
        }
    }

    public static void stopAll(List<Vehicle> list){
        System.out.println("----------Всем стоп----------");
        for (Vehicle vehicle : list){
            System.out.println("---------" + vehicle.getType().toUpperCase() + "---------");
            vehicle.stop();
        }
    }



}
/*
Задача 1.  Mail Delivery
Создайте интерфейс Vehicle с методами drive(), stop(). Реализуйте этот интерфейс в классах Car, Boat, Bike.

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