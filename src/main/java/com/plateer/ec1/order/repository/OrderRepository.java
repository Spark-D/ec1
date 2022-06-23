package com.plateer.ec1.order.repository;

import com.plateer.ec1.order.dto.OrderDto;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    
    public void insertOrderData(OrderDto orderDto) {
        System.out.println("주문 생성 데이터를 저장한다");
    }
}
