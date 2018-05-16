/**
 * Copyright: Copyright (c) 2018 
 * 
 * @author dell
 * @date 2018年1月24日 下午3:47:13
 * @version V1.0
 */
package com.ptxu.java8tutorials.comparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName: SortWithoutLamba
 * @Description: TODO
 * @author dell
 * @date 2018年1月24日 下午3:47:13
 *
 */
public class SortWithLamba {

    /**
     * @Title: main
     * @Description: TODO
     * @param args
     */
    public static void main(String[] args) {
        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("zhangsan", new BigDecimal("70000"), 33));
        result.add(new Developer("lisi", new BigDecimal("80000"), 20));
        result.add(new Developer("wangwu", new BigDecimal("100000"), 10));
        result.add(new Developer("zhangliu", new BigDecimal("170000"), 55));

        System.out.println("Before Sort");

        for (Developer developer : result) {
            System.out.println(developer);
        }

        Comparator<Developer> comparator = (arg0, arg1) -> arg0.getSalary().compareTo(arg1.getSalary());

        result.sort(comparator.reversed());

        System.out.println("After Sort");
        result.forEach(dev -> System.out.println(dev));
    }

}
