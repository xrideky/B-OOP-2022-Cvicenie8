package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.Message;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Message> messages= new ArrayList();

        messages.add(new Message("hello"));
        messages.add(new Message("world"));

        for(Message m : messages){
            System.out.println(m.getContent());
        }

       ConcreteIndex concreteIndex = new ConcreteIndex();
       concreteIndex.add(new Message("hello"));
       concreteIndex.add(new Message("world"));
       concreteIndex.add(new Message("hello world"));
       System.out.println(concreteIndex.toString());
    }
}
