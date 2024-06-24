package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> books = new ArrayList<>();
        books.add("Harry Potter");
        Man man = new Man("Vasya", 20, books);
    }
}