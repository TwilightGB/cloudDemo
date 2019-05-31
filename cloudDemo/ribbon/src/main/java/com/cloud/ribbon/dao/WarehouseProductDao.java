package com.cloud.ribbon.dao;

import com.cloud.ribbon.po.WarehouseProduct;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
*  @author gengbin
*/
@Mapper
public interface WarehouseProductDao {

    int insertWarehouseProduct(WarehouseProduct warehouseProduct);

    int update(WarehouseProduct warehouseProduct);

    int updateWarehouseProduct(WarehouseProduct warehouseProduct);

    WarehouseProduct getById(int id);

    List<WarehouseProduct> queryWarehouseProduct(WarehouseProduct warehouseProduct);

    WarehouseProduct queryWarehouseProductLimit1(WarehouseProduct warehouseProduct);

}