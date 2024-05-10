package com.example.ORDERS.repositories;

import com.example.ORDERS.Models.OrderModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface OrderRepository extends CrudRepository<OrderModel,Long> {


    //Buscar por codigo
    public abstract ArrayList<OrderModel> findByCode(Integer code);

    //Buscar por nombre del cliente
    public abstract ArrayList<OrderModel> findByName(String name);

    //Eliminar por codigo


}
