package com.cloud.order.service.impl;


import com.cloud.order.Dto.Dict;
import com.cloud.order.dao.OrderDetailDao;
import com.cloud.order.po.OrderDetail;
import com.cloud.order.service.OrderDetailService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @HystrixCommand(fallbackMethod = "countServiceFallback")
    public String getProductCount(int productId) {
        return restTemplate.getForObject("http://wareHouseService/count?id=" + productId, String.class);
    }

    public String countServiceFallback(int id){
        return "error"+id;
    }

    @Override
    public Map<String, String> dictList(String dictType) {
        ResponseEntity<List> responseEntity = restTemplate.getForEntity("http://swordfish/queryDict?type=" + dictType, List.class);
        List<Dict> result = responseEntity.getBody();
        Map<String, String> map = new HashMap();
        if (!CollectionUtils.isEmpty(result)) {
            for (int i = 0; i < map.size(); i++) {
                map.put("name", result.get(i).getName());
                map.put("value", result.get(i).getValue());
            }
        }
        return map;
    }
}
