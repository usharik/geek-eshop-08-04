package ru.geekbrains.service;

import ru.geekbrains.persist.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> findOrdersByUsername(String username);

    void createOrder(String username);
}
