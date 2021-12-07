package com.java11.demo.java11Demo;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.lang.NonNull;

import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class LocalVariableSyntaxTest {

    @Test
    public void localVariableSyntax(){
        var list = Lists.newArrayList("Pawan", "Kulkarni");
        String resultString = list.stream()
                .map((@NonNull var x) -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        assertThat(resultString).isEqualTo("PAWAN, KULKARNI");
    }
}
