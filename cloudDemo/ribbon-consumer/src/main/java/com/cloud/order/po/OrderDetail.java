package com.cloud.order.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
*
*  @author gengbin
*/
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 主键
     * 订单详情表ID
     * isNullAble:0
     */
    private Integer orderDetailId;

    /**
     * 订单表ID
     * isNullAble:0
     */
    private Integer orderId;

    /**
     * 订单商品ID
     * isNullAble:0
     */
    private Integer productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 购买商品数量
     * isNullAble:0,defaultVal:1
     */
    private Integer productCnt;

    /**
     * 购买商品单价
     * isNullAble:0,defaultVal:0
     */
    private BigDecimal productPrice;

    /**
     * 平均成本价格
     * isNullAble:0,defaultVal:0.00
     */
    private BigDecimal averageCost;

    /**
     * 商品重量
     * isNullAble:0,defaultVal:0.00
     */
    private double weight;

    /**
     * 优惠分摊金额
     * isNullAble:0,defaultVal:0.00
     */
    private double feeMoney;

    /**
     * 仓库ID
     * isNullAble:0,defaultVal:0.00
     */
    private Integer wId;

    /**
     * 最后修改时间
     * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
     */
    private Date modifiedTime;

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductCnt() {
        return productCnt;
    }

    public void setProductCnt(Integer productCnt) {
        this.productCnt = productCnt;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(BigDecimal averageCost) {
        this.averageCost = averageCost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFeeMoney() {
        return feeMoney;
    }

    public void setFeeMoney(double feeMoney) {
        this.feeMoney = feeMoney;
    }

    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}