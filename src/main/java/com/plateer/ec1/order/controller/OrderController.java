package com.plateer.ec1.order.controller;

import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("order")
    public ResponseEntity<String> order(@RequestBody OrderRequest orderRequest){
        orderService.order(orderRequest);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
