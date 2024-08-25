package com.example.SpringPractice1.service;

import com.example.SpringPractice1.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface StoreService {


    void add(List<Long>itemIds);


    List<Item> get();

}
