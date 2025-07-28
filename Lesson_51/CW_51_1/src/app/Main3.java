package app;

import java.io.File;

public class Main3 {
    public static void main(String[] args) {
        File file = new File("./Lesson_51/persons.txt");
        File file1 = new File("./Lesson_51/");
        System.out.println("exists = " +file.exists());
        System.out.println("isDirectory() " + file.isDirectory() );
        System.out.println("isFile " + file.isFile());
        if (file1.isDirectory()){
            File[] files = file1.listFiles();
            for (var f : files){
                System.out.println(f);
            }
        }
    }
}
