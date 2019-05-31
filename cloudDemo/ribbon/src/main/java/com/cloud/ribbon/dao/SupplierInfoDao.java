package com.cloud.ribbon.dao;

import com.cloud.ribbon.po.SupplierInfo;

import java.util.List;
/**
*  @author gengbin
*/
public interface SupplierInfoDao {

    int insertSupplierInfo(SupplierInfo object);

    int updateSupplierInfo(SupplierInfo object);

    int update(SupplierInfo.UpdateBuilder object);

    List<SupplierInfo> querySupplierInfo(SupplierInfo object);

    SupplierInfo querySupplierInfoLimit1(SupplierInfo object);

}