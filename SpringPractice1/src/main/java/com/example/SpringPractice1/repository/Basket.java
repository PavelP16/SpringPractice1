package com.example.SpringPractice1.repository;

import com.example.SpringPractice1.model.Item;
import org.springframework.stereotype.Component;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class Basket {
    private final List<Item> basket = new ArrayList<>();


    public void addAll(List<Item> items) {
        basket.addAll(items);

    }

    public List<Item> getAll() {
        return Collections.unmodifiableList(basket);
    }

}
