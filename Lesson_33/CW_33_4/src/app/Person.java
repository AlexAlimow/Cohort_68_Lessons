package app;

public class Person {
    private String firstName;  // обязательные поля к заполнению
    private String lastName;   // обязательные поля к заполнению
    private int age;
    private int weight;
    private int height;

    private Person(Builder builder){
        this.firstName = builder.firstName; // обязательные поля к заполнению
        this.lastName = builder.lastName; // обязательные поля к заполнению
        this.age = builder.age;
        this.weight = builder.weight;
        this.height = builder.height;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private int age = 0;
        private int weight = 0;
        private int height = 0;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        } // конструктор только на обязательные поля к заполнению

        public Builder age(int age){
            this.age = age;
            return this;
        } // заполнятель поля age для инстанса Builder

        public Builder weight(int weight){
            this.weight = weight;
            return this;
        }// заполнятель поля weight для инстанса Builder

        public Builder height(int height){
            this.height = height;
            return this;
        } // заполнятель поля для height инстанса Builder

        public Person build(){
            return new Person(this);
        } // метод пораждающий инстанс Peson на базе заполненного инстанса Builder
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
