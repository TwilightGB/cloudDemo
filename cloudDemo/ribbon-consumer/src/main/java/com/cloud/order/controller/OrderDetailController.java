package com.cloud.order.controller;


import com.cloud.order.common.CommonDto;
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
    String prefix = "orderdetail";
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

    @GetMapping("/submit")
    @ResponseBody
    public CommonDto submit(Integer id){
        CommonDto commonDto = new CommonDto();
        String count = orderDetailService.getProductCount(id);
//        orderDetailService.dictList("hobby");
        int result = Integer.parseInt(count);
        if(result==0){
            commonDto.setCode(-1);
            commonDto.setMessage("商品不足，"+"商品数量"+result);
        }else{
            commonDto.setCode(0);
            commonDto.setMessage("提交成功，"+"商品数量"+result);
        }
        return commonDto;
    }
}