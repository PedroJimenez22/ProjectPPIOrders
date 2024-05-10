package com.example.ORDERS.controllers;

import com.example.ORDERS.Models.OrderModel;
import com.example.ORDERS.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.JstlUtils;

import java.util.ArrayList;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping()
    //get
    public ArrayList<OrderModel> findAllOrders(){
        return orderService.findAllOrders();
    }

    //post
    @PostMapping()
    public OrderModel saveOrder(@RequestBody OrderModel order){
        return orderService.saveOrder(order);
    }

    //editar
    @PutMapping()
    public OrderModel updateOrder(@RequestBody OrderModel order){
        return orderService.saveOrder(order);
    }

    //Buscar por codigo
    @GetMapping(path = "find-by-code") //localhost:8080/order/find-by-code
    public ArrayList<OrderModel> findByCode(@RequestParam("code")Integer code){
        return orderService.findByCode(code);
    }

    //Buscar por nombre
    @GetMapping(path = "find-by-name") //localhost:8080/order/find-by-name
    public ArrayList<OrderModel> findByName(@RequestParam("name")String name){
        return orderService.findByName(name);
    }

    @DeleteMapping("/delete-order-by-id")
    public String deleteOrderById(@RequestParam("id")Long Id){
        return orderService.deleteOrderById(Id);
    }

}
