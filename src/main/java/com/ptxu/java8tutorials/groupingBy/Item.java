/**
 * Copyright: Copyright (c) 2018 
 * Company:深圳市深网视界科技有限公司
 * 
 * @author dell
 * @date 2018年1月24日 下午5:59:58
 * @version V1.0
 */
package com.ptxu.java8tutorials.groupingBy;

import java.math.BigDecimal;

/**
 * @ClassName: Item
 * @Description: TODO
 * @author dell
 * @date 2018年1月24日 下午5:59:58
 *
 */
public class Item {

    private String name;
    private int qty;
    private BigDecimal price;

    /**
     * 创建一个新的实例 Item.
     * <p>
     * Title:
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param string
     * @param i
     * @param bigDecimal
     */
    public Item(String name, int qty, BigDecimal price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    /**
     * getter method
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * setter method
     * 
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter method
     * 
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * setter method
     * 
     * @param qty
     *            the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * getter method
     * 
     * @return the price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * setter method
     * 
     * @param price
     *            the price to set
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
