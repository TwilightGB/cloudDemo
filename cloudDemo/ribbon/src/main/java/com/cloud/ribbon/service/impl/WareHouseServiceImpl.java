package com.cloud.ribbon.service.impl;

import com.cloud.ribbon.dao.WarehouseProductDao;
import com.cloud.ribbon.po.WarehouseProduct;
import com.cloud.ribbon.service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class WareHouseServiceImpl implements WareHouseService {
    @Autowired
    WarehouseProductDao warehouseProductDao;

    @Override
    public int currentCount(int productId) {
        int count;
        WarehouseProduct query = new WarehouseProduct();
        query.setProductId(productId);
        List<WarehouseProduct> result = warehouseProductDao.queryWarehouseProduct(query);
        if(!CollectionUtils.isEmpty(result)){
            count = result.get(0).getCurrentCnt();
            return count;
        }
        return 0;
    }

    @Override
    public int insertWarehouseProduct(WarehouseProduct warehouseProduct) {
        return warehouseProductDao.insertWarehouseProduct(warehouseProduct);
    }

    @Override
    public int update(WarehouseProduct warehouseProduct) {
        return warehouseProductDao.update(warehouseProduct);
    }

    @Override
    public WarehouseProduct getById(int id) {
        return warehouseProductDao.getById(id);
    }

    @Override
    public List<WarehouseProduct> list(WarehouseProduct warehouseProduct) {
        return warehouseProductDao.queryWarehouseProduct(warehouseProduct);
    }
}
