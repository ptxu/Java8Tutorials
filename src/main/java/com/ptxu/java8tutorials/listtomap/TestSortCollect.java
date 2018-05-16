/**
 * Copyright: Copyright (c) 2018 
 * Company:深圳市深网视界科技有限公司
 * 
 * @author dell
 * @date 2018年1月25日 上午11:05:50
 * @version V1.0
 */
package com.ptxu.java8tutorials.listtomap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName: TestSortCollect
 * @Description: TODO
 * @author dell
 * @date 2018年1月25日 上午11:05:50
 *
 */
public class TestSortCollect {

    /**
     * @Title: main
     * @Description: TODO
     * @param args
     */
    public static void main(String[] args) {
        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));
        list.add(new Hosting(6, "linode.com", 100000));

        // example 1
        Map result1 = list.stream().sorted(Comparator.comparingLong(Hosting::getWebsites).reversed()).collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites, // key = name, value = websites
                (oldValue, newValue) -> oldValue, // if same key, take the old key
                LinkedHashMap::new // returns a LinkedHashMap, keep order
        ));

        System.out.println("Result 1 : " + result1);
    }

}
