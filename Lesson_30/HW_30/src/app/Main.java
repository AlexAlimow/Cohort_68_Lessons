package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Truck(2020,"Volvo","1",2000));
        vehicles.add(new Bus(2025,"Mercedes-Benz","2",23));
        vehicles.add(new Car(2025,"BMW","5"));
        vehicles.add(new Bus(2025,"Volvo","2",23));
        vehicles.add(new Car(2024,"Audi","2"));
        vehicles.add(new Car(2022,"Volkswagen","1"));
        vehicles.add(new Truck(2020,"Scania","1",4000));
        vehicles.add(new Car(2023,"Cupra","3"));

       for (Vehicle vehicle : vehicles){
           vehicle.drive();
       }

    }
    private static void drive(){

    }
}
/*
Задача 1

Предположим, у вас есть программа для учета различных видов транспортных средств в автопарке.
У вас есть базовый класс Vehicle, который представляет общую информацию о транспортном средстве,
такую как номер (number), марка (brand)  и год выпуска (year).
Создайте подклассы для различных типов транспортных средств, таких как Car, Truck, Bus и т. д.
В каждом Truck, Bus добавьте дополнительные свойства, специфичные для данного типа транспортного средства.
 Например, для Truck - грузоподъемность (loadCapacity),
  для Bus - кол-во пассажиров (numberOfSeats or numberOfPassenger).
Создайте метод drive() который выводит на экран номер транспортного средства и слово 'поехали'.
Кроме этого, в случае Truck - метод должен выводить запись о том,
что перевозим столько то тонн груза, а в случае Bus - столько то пассажиров.
В main создайте список транспортных средств и каждое "отправьте в поездку" т.е. drive()

 */