package com.java11.demo.java11Demo;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class PredicateTest {

    @Test
    public void predicate_demo(){
        var list = Lists.newArrayList("String", "List", "Map", "\n \n", "File", " ");
        List withoutBlanks = list.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        assertThat(withoutBlanks).containsExactly("String", "List", "Map", "File");
    }
}
