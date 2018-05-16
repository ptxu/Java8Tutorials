/**
 * Copyright: Copyright (c) 2018 
 * Company:深圳市深网视界科技有限公司
 * 
 * @author dell
 * @date 2018年1月25日 上午10:16:00
 * @version V1.0
 */
package com.ptxu.java8tutorials.filternull;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName: FilterNull
 * @Description: TODO
 * @author dell
 * @date 2018年1月25日 上午10:16:00
 *
 */
public class FilterNull {

    /**
     * @Title: main
     * @Description: TODO
     * @param args
     */
    public static void main(String[] args) {
        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");
        List<String> result = language.collect(Collectors.toList());
        result.forEach(System.out::println);

        language = Stream.of("java", "python", "node", null, "ruby", null, "php");
        result = language.filter(x -> x != null).collect(Collectors.toList());
        result.forEach(System.out::println);

        language = Stream.of("java", "python", "node", null, "ruby", null, "php");
        result = language.filter(Objects::nonNull).collect(Collectors.toList());
        result.forEach(System.out::println);

    }

}
