package com.Nivi.Proyecto.persistence.repository;


import com.Nivi.Proyecto.persistence.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {
}
