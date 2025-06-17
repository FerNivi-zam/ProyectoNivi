package com.Nivi.Proyecto.persistence.repository;


import com.Nivi.Proyecto.persistence.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface PizzaRepository extends ListCrudRepository<PizzaEntity,Integer> {

}
