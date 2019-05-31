package com.cloud.order.service;

import com.cloud.order.po.OrderDetail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderDetailService {

//    int insert(OrderDetail orderDetail);
//
//    int update(OrderDetail orderDetail);

    OrderDetail getById(int id);

    List<OrderDetail> query(OrderDetail orderDetail);
}