/**
 * Copyright: Copyright (c) 2018 
 * Company:深圳市深网视界科技有限公司
 * 
 * @author dell
 * @date 2018年1月25日 上午10:58:32
 * @version V1.0
 */
package com.ptxu.java8tutorials.listtomap;

/**
 * @ClassName: Hosting
 * @Description: TODO
 * @author dell
 * @date 2018年1月25日 上午10:58:32
 *
 */
public class Hosting {

    private int Id;
    private String name;
    private long websites;

    public Hosting(int id, String name, long websites) {
        Id = id;
        this.name = name;
        this.websites = websites;
    }

    /**
     * getter method
     * 
     * @return the id
     */
    public int getId() {
        return Id;
    }

    /**
     * setter method
     * 
     * @param id
     *            the id to set
     */
    public void setId(int id) {
        Id = id;
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
     * @return the websites
     */
    public long getWebsites() {
        return websites;
    }

    /**
     * setter method
     * 
     * @param websites
     *            the websites to set
     */
    public void setWebsites(long websites) {
        this.websites = websites;
    }

}
