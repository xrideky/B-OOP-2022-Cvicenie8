package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.Message;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIndex extends GenericIndex<Character, Message>{


    public void add(Message m){
        this.put(m.getContent().charAt(0),m);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for( var entry :  this.index.entrySet()){
            builder.append("-------------\n");
            builder.append("Key " + entry.getKey() + "\n");
            for(Message m: entry.getValue()){
                builder.append("\tmessege " + m.getContent() + "\n");
            }
        }
        return builder.toString();
    }
}
