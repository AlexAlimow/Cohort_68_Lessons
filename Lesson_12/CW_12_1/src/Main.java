/*
HW_12


 */


public class Main {
    public static class Person2 {
        String name;
        int age;
        public  Person2(String personName, int personAge) {
            name = personName;
            age = personAge;
        }
        void sayInfo() {
            System.out.println(name + " is " + age + " years old.");
        }
    }

    public static class Person  {
        String name;
        int age;
        void sayHello(){
            System.out.println("Hi! My name is " + name);
        }

    }
    public static int add(int a, int b) {
        return a + b;
    }

    public static void sayHello() {
        System.out.println("Hello");

    }

    public static void great(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        System.out.println("Hello G-68!!!");
        System.out.println("Vasya" + " Ivanov");
        System.out.println("\tHello\n" + 2345 + " By-by");
        System.out.println("========================");
        System.out.print("Answer is = " + (5 + 7));
        System.out.println("!!!!!!!!!!");
        System.out.println("Я изучаю программирование Java");
        System.out.println("10+12" + "=" + (10 + 20));
        System.out.println("======================");
        int age = 37;
        double height = 91.5;
        char grade = 'A';
        boolean isJavaFun = true;
        String name = "Alex";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height " + height);
        System.out.println("Grade " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);
        sayHello();
        great("Alex");
        great("Bob");
        int result = add(5, 6);
        System.out.println("Result: " + result);
        sayHello();
        Person p1 = new Person();
        p1.name ="Alex";
        p1.age = 30;
        p1.sayHello();
        Person2 p2 = new Person2("Sawah",12);
        p2.sayInfo();

    }
}

// комментарий в Java
/*
Многострочный комментарий с спомощью /*


 */
