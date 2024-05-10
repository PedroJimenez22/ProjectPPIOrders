package com.example.ORDERS.services;

import com.example.ORDERS.Models.OrderModel;
import com.example.ORDERS.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    //Obtener todos las ordenes
    public ArrayList<OrderModel> findAllOrders(){
        return (ArrayList<OrderModel>) orderRepository.findAll();
    }

    //Guardar todas las ordenes
    public OrderModel saveOrder(OrderModel orders){
        return orderRepository.save(orders);
    }

    //Buscar por nombre
    public ArrayList<OrderModel> findByName(String name){
        return orderRepository.findByName(name);
    }

    //Buscar por codigo
    public ArrayList<OrderModel> findByCode(Integer code){
        return orderRepository.findByCode(code);
    }

    public String deleteOrderById(Long Id){
        if(orderRepository.findById(Id).isPresent()){
            orderRepository.deleteById(Id);
            return "Order delete Successfully";
        }
        else{
            return "Order with Id "+ Id+" not found";
        }
    }

}
