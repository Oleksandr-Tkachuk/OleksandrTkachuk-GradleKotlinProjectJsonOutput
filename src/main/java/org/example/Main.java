package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        IAmPerson iAmPerson = new IAmPerson("Oleksandr", "Tkachuk");

        Gson gson = new Gson();

        String json = gson.toJson(iAmPerson);

        System.out.println(json);

    }
}