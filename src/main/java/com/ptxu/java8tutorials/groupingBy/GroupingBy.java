/**
 * Copyright: Copyright (c) 2018 
 * 
 * @author dell
 * @date 2018年1月24日 下午4:49:39
 * @version V1.0
 */
package com.ptxu.java8tutorials.groupingBy;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @ClassName: GroupingBy
 * @Description: TODO
 * @author dell
 * @date 2018年1月24日 下午4:49:39
 *
 */
public class GroupingBy {

    /**
     * @Title: main
     * @Description: TODO
     * @param args
     */
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papary");
        Map<String, Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);

        Map<String, Long> finalMap = new LinkedHashMap<>();

        // Sort a map and add to finalMap
        result.entrySet().stream().sorted(Map.Entry.<String, Long> comparingByValue().reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        System.out.println(finalMap);

    }

}
