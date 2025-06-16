package com.Nivi.Proyecto.service;


import com.Nivi.Proyecto.Presitence.entity.OrderEntity;
import com.Nivi.Proyecto.Presitence.respository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<OrderEntity> getAll() {
        return this.orderRepository.findAll();
    }
}
