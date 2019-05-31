package com.cloud.order.controller;


import com.cloud.order.po.OrderDetail;
import com.cloud.order.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/orderDetail")
public class OrderDetailController {
    String prefix = "orderDetail";
    @Autowired
    private OrderDetailService orderDetailService ;

    @GetMapping("/list")
    @ResponseBody
    public List<OrderDetail> list(){
        OrderDetail orderDetail = new OrderDetail();
        return orderDetailService.query(orderDetail);
    }

    @GetMapping("/index")
    public String index(Model model){
        return prefix+"/index";
    }
}