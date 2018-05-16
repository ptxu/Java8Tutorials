/**
 * Copyright: Copyright (c) 2018 
 * 
 * @author dell
 * @date 2018年1月24日 下午4:14:15
 * @version V1.0
 */
package com.ptxu.java8tutorials.foreachmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: ForEachMapWithLambda
 * @Description: TODO
 * @author dell
 * @date 2018年1月24日 下午4:14:15
 *
 */
public class ForEachMapWithLambda {

    public static void main(String[] args) {

        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        items.put("G", 70);

        items.forEach((k, v) -> System.out.println("key is " + k + " value is " + v));

        items.forEach((k, v) -> {
            if (v == 40) {
                System.out.println(k + " ..... " + v);
            }
            else {
                System.out.println(k + "  " + v);
            }
        });

    }

}
