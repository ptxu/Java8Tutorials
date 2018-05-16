/**
 * Copyright: Copyright (c) 2018 
 * 
 * @author dell
 * @date 2018年1月24日 下午3:51:40
 * @version V1.0
 */
package com.ptxu.java8tutorials.comparator;

import java.math.BigDecimal;

/**
 * @ClassName: Developer
 * @Description: TODO
 * @author dell
 * @date 2018年1月24日 下午3:51:40
 *
 */
public class Developer {

    private String name;

    private BigDecimal salary;

    private int age;

    /**
     * 创建一个新的实例 Developer.
     * <p>
     * Title:
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @param string
     * @param bigDecimal
     * @param i
     */
    public Developer(String name, BigDecimal salary, int age) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Developer() {

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
     * @return the salary
     */
    public BigDecimal getSalary() {
        return salary;
    }

    /**
     * setter method
     * 
     * @param salary
     *            the salary to set
     */
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    /**
     * getter method
     * 
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * setter method
     * 
     * @param age
     *            the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /*
     * <p>Title: toString</p> <p>Description: </p>
     * 
     * @return
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Developer [name=" + name + ", salary=" + salary + ", age=" + age + "]";
    }

}
