package app.myInterfaces;

public interface Swimmable {
    void swim();
    default String getType(){
        qwe();
        return "Не известный тип";
    }    // реализация по дефолту если в классе нет такого метода к примеру

    private String qwe(){
        return "";
    }
}
