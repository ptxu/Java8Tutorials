/**
 * Copyright: Copyright (c) 2018 
 * 
 * @author dell
 * @date 2018年1月24日 下午4:20:31
 * @version V1.0
 */
package com.ptxu.java8tutorials.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName: StreamFilter
 * @Description: TODO
 * @author dell
 * @date 2018年1月24日 下午4:20:31
 *
 */
public class StreamFilter {

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("C++", "Java", "Golang", "Python");
        List<String> result = lines.stream().filter(p -> !"C++".equals(p)).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
