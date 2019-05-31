package com.cloud.order.service.impl;


import com.cloud.order.dao.OrderDetailDao;
import com.cloud.order.po.OrderDetail;
import com.cloud.order.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    OrderDetailDao orderDetailDao;

    @Autowired
    RestTemplate restTemplate;
//    @Override
//    public int insert(OrderDetail orderDetail) {
//        return orderDetailDao.insert(orderDetail);
//    }
//
//    @Override
//    public int update(OrderDetail orderDetail) {
//        return orderDetailDao.update(orderDetail);
//    }

    @Override
    public OrderDetail getById(int id) {
        return orderDetailDao.getById(id);
    }

    @Override
    public List<OrderDetail> query(OrderDetail orderDetail) {
        return orderDetailDao.query(orderDetail);
    }

    @Override
    public String getProductCount(int productId) {
        return restTemplate.getForObject("http://wareHouseService/count?id="+productId,String.class);
    }
}
