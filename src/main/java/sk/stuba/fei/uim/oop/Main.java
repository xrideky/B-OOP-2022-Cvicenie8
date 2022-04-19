package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.Message;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       GenericIndex<Character, Message> concreteIndex = new GenericIndex<>();
        var old  = concreteIndex.put('w',new Message("world"));
        System.out.println(old);
        old = concreteIndex.put('h',new Message("hello world"));
        System.out.println(old);
        old = concreteIndex.put('h',new Message("hello"));
        System.out.println(old);

    }
}
