package com.ruxi.testNove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("I am a boy");
        list.add("I love the girl");
        list.add("But the girl loves another girl");

        List<String> collect = list.stream()
                .map(p -> p.split(" "))
                .flatMap(Arrays::stream)
                .collect(toList());
        System.out.println(collect);
        List<String> collect1 = list.stream().map(p -> p.split(""))
                .flatMap(Arrays::stream).distinct().collect(toList());
        System.out.println(collect1);
        Optional<String> any = list.stream().findAny();
        System.out.println(any);


    }
}
