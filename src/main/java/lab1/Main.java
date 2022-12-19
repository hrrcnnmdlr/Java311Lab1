package lab1;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //создаем наш объект
        Animal animal1 = new Animal.Builder()
                .withName("Donald")
                .withSex("Male")
                .withAge(6)
                .build();
    }
}


