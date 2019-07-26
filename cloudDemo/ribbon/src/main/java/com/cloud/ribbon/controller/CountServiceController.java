package com.cloud.ribbon.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cloud.ribbon.common.CommonDto;
import com.cloud.ribbon.po.WarehouseProduct;
import com.cloud.ribbon.service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/restService")
public class CountServiceController {
    @Autowired
    private WareHouseService wareHouseService;
    @GetMapping("/count")
    public String count(Integer id){
        return wareHouseService.currentCount(id)+"";
    }

    @RequestMapping(value = "/getNum", method = RequestMethod.GET)
    public String sendGetData(HttpServletRequest request, HttpServletResponse response) {
        return wareHouseService.currentCount(Integer.parseInt(request.getParameter("id")))+"";
    }

    /**
     * 新增数据
     * @param requestBody
     * @return
     */
    @RequestMapping(value = "/updateNum", method = RequestMethod.POST)
    public String sendPostDataByJson(@RequestBody String requestBody) {
        JSONObject object = JSONObject.parseObject(requestBody);
        String productId = String.valueOf(object.get("id"));
        String wareHouseId = String.valueOf(object.get("houseId"));
        String count = String.valueOf(object.get("count"));
        WarehouseProduct product = new WarehouseProduct();
        product.setProductId(Integer.parseInt(productId));
        product.setwId(Integer.parseInt(wareHouseId));
        product.setCurrentCnt(Integer.parseInt(count));
        int result = wareHouseService.insertWarehouseProduct(product);
        CommonDto dto = new CommonDto();
        if (result > 0) {
            dto.setCode(1);
            dto.setMessage("update success");
        } else {
            dto.setCode(0);
            dto.setMessage("update fail");
        }
        return JSON.toJSONString(dto);
    }
}