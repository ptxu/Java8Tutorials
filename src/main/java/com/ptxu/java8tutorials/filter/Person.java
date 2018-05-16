/**
 * Copyright: Copyright (c) 2018 
 * 
 * @author dell
 * @date 2018年1月24日 下午4:30:09
 * @version V1.0
 */
package com.ptxu.java8tutorials.filter;

/**
 * @ClassName: Person
 * @Description: TODO
 * @author dell
 * @date 2018年1月24日 下午4:30:09
 *
 */
public class Person {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

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
        return "Person [name=" + name + ", age=" + age + "]";
    }

}
