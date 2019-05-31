package com.cloud.ribbon.dao;

import com.cloud.ribbon.po.ShippingInfo;

import java.util.List;
/**
*  @author gengbin
*/
public interface ShippingInfoDao {

    int insertShippingInfo(ShippingInfo object);

    int updateShippingInfo(ShippingInfo object);

    int update(ShippingInfo.UpdateBuilder object);

    List<ShippingInfo> queryShippingInfo(ShippingInfo object);

    ShippingInfo queryShippingInfoLimit1(ShippingInfo object);

}