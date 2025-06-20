package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Задача 1
Напишите программу, которая просит пользователя ввести номер месяца и выводит название введенного месяца:

Введите номер месяца:
3
Месяц номер 3: март

         */
                Scanner scanner = new Scanner(System.in);

                // Ввод номера месяца
                System.out.print("Введите номер месяца: ");
                int monthNumber = scanner.nextInt();

                // Название месяца
                String monthName = switch (monthNumber) {
                    case 1 -> "январь";
                    case 2 -> "февраль";
                    case 3 -> "март";
                    case 4 -> "апрель";
                    case 5 -> "май";
                    case 6 -> "июнь";
                    case 7 -> "июль";
                    case 8 -> "август";
                    case 9 -> "сентябрь";
                    case 10 -> "октябрь";
                    case 11 -> "ноябрь";
                    case 12 -> "декабрь";
                    default -> null;
                };

        // Вывод результата
                if (monthName != null) {
                    System.out.println("Месяц номер " + monthNumber + ": " + monthName);
                } else {
                    System.out.println("Ошибка: некорректный номер месяца");
                }


            }
        }


