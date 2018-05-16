/**
 * Copyright: Copyright (c) 2018 
 * Company:深圳市深网视界科技有限公司
 * 
 * @author dell
 * @date 2018年1月25日 上午10:27:54
 * @version V1.0
 */
package com.ptxu.java8tutorials.arraytostream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @ClassName: ArrayToStream
 * @Description: TODO
 * @author dell
 * @date 2018年1月25日 上午10:27:54
 *
 */
public class ArrayToStream {

    /**
     * @Title: main
     * @Description: TODO
     * @param args
     */
    public static void main(String[] args) {
        String[] array = { "a", "b", "c", "d", "e" };

        Stream stream1 = Arrays.stream(array);
        stream1.forEach(System.out::println);

        Stream<String> stream2 = Stream.of(array);
        stream2.forEach(System.out::println);
    }

}
