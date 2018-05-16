/**
 * Copyright: Copyright (c) 2018 
 * Company:深圳市深网视界科技有限公司
 * 
 * @author dell
 * @date 2018年1月25日 上午10:36:34
 * @version V1.0
 */
package com.ptxu.java8tutorials.steamclosed;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @ClassName: StreamIsClosed
 * @Description: TODO
 * @author dell
 * @date 2018年1月25日 上午10:36:34
 *
 */
public class StreamIsClosed {

    /**
     * @Title: main
     * @Description: TODO
     * @param args
     */
    public static void main(String[] args) {

        String[] array = { "a", "b", "c", "d", "e" };
        Stream<String> stream = Arrays.stream(array);

        // loop a stream
        stream.forEach(x -> System.out.println(x));

        // reuse it to filter again! throws IllegalStateException
        long count = stream.filter(x -> "b".equals(x)).count();
        System.out.println(count);
    }

}
