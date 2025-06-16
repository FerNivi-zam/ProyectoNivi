package com.Nivi.Proyecto.Presitence.respository;


import com.Nivi.Proyecto.Presitence.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {
}
