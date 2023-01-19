package com.vsk.orderservice.controller;

import com.vsk.orderservice.dto.OrderRequest;
import com.vsk.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService ;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String postOrder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "Order placed successfully" ;
    }



}
