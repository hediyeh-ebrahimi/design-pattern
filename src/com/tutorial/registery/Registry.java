package com.tutorial.registery;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
 * registry = caching - mapping
 * clone for objects -> not user to manipulate
 * */
public class Registry {
    private Map<Long, Item> map = new HashMap<>();

    {
        add(new Item(1L,"item 1" , new Date()));
    }

    public Item get(Long id) {
        if(map.containsKey(id)){
            return map.get(id).clone();
        }
        return null;
    }

    public void add(Item item) {
        System.out.println(item.hashCode()+"--origin");
        map.put(item.getId(), item);
    }
}
