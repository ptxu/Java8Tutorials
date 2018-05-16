/**
 * Copyright: Copyright (c) 2018 
 * Company:深圳市深网视界科技有限公司
 * 
 * @author dell
 * @date 2018年1月25日 上午11:19:34
 * @version V1.0
 */
package com.ptxu.java8tutorials.FlatMap;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @ClassName: TestExample1
 * @Description: TODO
 * @author dell
 * @date 2018年1月25日 上午11:19:34
 *
 */
public class TestExample1 {

    /**
     * @Title: main
     * @Description: TODO
     * @param args
     */
    public static void main(String[] args) {
        String[][] data = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

        Stream<String[]> tmp = Arrays.stream(data);
        Stream<String> stringStream = tmp.flatMap(x -> Arrays.stream(x));

        Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));
        stream.forEach(System.out::println);
    }

}
