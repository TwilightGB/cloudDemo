package com.cloud.order.dao;


import com.cloud.order.po.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
*  @author gengbin
*/
@Mapper
public interface OrderDetailDao {

//    int insert(OrderDetail orderDetail);

//    int update(OrderDetail orderDetail);

    OrderDetail getById(int id);

    List<OrderDetail> query(OrderDetail orderDetail);

}