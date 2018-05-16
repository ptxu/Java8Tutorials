/**
 * Copyright: Copyright (c) 2018 
 * 
 * @author dell
 * @date 2018年1月24日 下午4:33:13
 * @version V1.0
 */
package com.ptxu.java8tutorials.filter;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: FilterFindAnyOrElse
 * @Description: TODO
 * @author dell
 * @date 2018年1月24日 下午4:33:13
 *
 */
public class FilterFindAnyOrElse {

    /**
     * @Title: main
     * @Description: TODO
     * @param args
     */
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("zhangsan", 30), new Person("zhangsan", 90), new Person("lisi", 40), new Person("wangwu", 10));
        Person result1 = persons.stream().filter(p -> "zhangsan".equals(p.getName())).findAny().orElse(null);
        System.out.println(result1);

        Person result2 = persons.stream().filter(p -> p.getName().equals("adfa")).findFirst().orElse(null);
        System.out.println(result2);

        Person result3 = persons.stream().filter(p -> "zhangsan".equals(p.getName()) && p.getAge() == 30).findAny().orElse(null);
        System.out.println(result3);

        Person result4 = persons.stream().filter(p -> "zhangsan".equals(p.getName())).findFirst().orElse(null);
        System.out.println(result4);

        String name = persons.stream().filter(p -> p.getName().equals("zhangsan")).map(Person::getName).findAny().orElse("");
        System.out.println(name);
    }

}
