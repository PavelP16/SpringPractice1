package com.example.SpringPractice1.service;

import com.example.SpringPractice1.model.Item;
import com.example.SpringPractice1.repository.Basket;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class StoreServiceImpl implements StoreService {
    private final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    public void add(List<Long> itemIds) {
        basket.addAll(itemIds.stream()
                .map(Item::new).toList());

    }

    public List<Item> get() {
        return basket.getAll();

    }

}
