package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericIndex<KEY_TYPE, VALUE_TYPE> {

    private Map<KEY_TYPE, List<VALUE_TYPE>> index;

    public GenericIndex(){
        this.index = new HashMap<>();
    }

    public List<VALUE_TYPE> put(KEY_TYPE key, VALUE_TYPE value){
        var currentValue = this.index.get(key);
        List<VALUE_TYPE> oldValue;
        if(currentValue != null){
            oldValue = new ArrayList<>(currentValue);
        } else {
            oldValue = null;
        }

        if(this.index.containsKey(key)){
            this.index.get(key).add(value);
        }else {
            List<VALUE_TYPE> newList = new ArrayList<>();
            newList.add(value);
            this.index.put(key,newList);
        }
        return oldValue;
    }
}
