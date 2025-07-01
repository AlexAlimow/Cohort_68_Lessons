package app.model;

public class Person {
   private String name;
   private String surname;
   private int age;
   private int id;
   private static int counter = 0;
   private static long populationOfWorld = 8_000_000_000l;

   public Person(String name, String surname, int age) {
      this.name = name;
      this.surname = surname;
      this.age = age;
      this.id = counter;
      counter++;
   }

   public String getName() {
      return name;
   }

   public String getSurname() {
      return surname;
   }

   public int getAge() {
      return age;
   }

   public int getId() {
      return id;
   }

   public static int getCounter() {
      return counter;
   }
   public static long getPopulationOfWorld() {
      return populationOfWorld;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setSurname(String surname) {
      this.surname = surname;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public void setId(int id) {
      this.id = id;
   }

   public static void setCounter(int counter) {
      Person.counter = counter;
   }

   public static void setPopulationOfWorld(long populationOfWorld) {
      Person.populationOfWorld = populationOfWorld;
   }

   @Override
   public String toString() {
      return "Person(" +
              "name= " + name + '\'' +
              ", surname= " + surname + '\'' +
              ", age=" + age +
              ", id=" + (id + 1) +
              ')';
   }

   public static void sayHello(){
      System.out.println("Hello World !!!");
   }
   public void myNameIs(){
      System.out.println("my name is " + this.name);
      System.out.println("I know what the population now is " + populationOfWorld);
   }

   public static void sayGreeting(Person p) {
      System.out.println("Hello my dear friend " + p.name + " !");

   }
}

