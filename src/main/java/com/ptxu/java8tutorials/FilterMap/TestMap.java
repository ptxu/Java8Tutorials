/**
 * Copyright: Copyright (c) 2018 
 * Company:深圳市深网视界科技有限公司
 * 
 * @author dell
 * @date 2018年1月25日 上午11:08:55
 * @version V1.0
 */
package com.ptxu.java8tutorials.FilterMap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName: TestMap
 * @Description: TODO
 * @author dell
 * @date 2018年1月25日 上午11:08:55
 *
 */
public class TestMap {

    public static void main(String[] args) {

        Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");

        Map<Object, Object> collect = HOSTING.entrySet().stream().filter(map -> map.getKey() == 2).collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
        System.out.println(collect); // output : {2=heroku.com}

    }
}
