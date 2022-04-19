package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.Message;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConcreteIndex ci = new ConcreteIndex();
        ci.add(new Message("hello"));
        ci.add(new Message("world"));
        ci.add(new Message("hello world"));

        System.out.println(ci);

    }
}
