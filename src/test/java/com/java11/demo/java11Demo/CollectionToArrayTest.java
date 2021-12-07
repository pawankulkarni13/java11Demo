package com.java11.demo.java11Demo;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionToArrayTest {

    @Test
    public void collection_Array_test(){

        var sampleList = Lists.newArrayList("Java9", "Java10", "Java11", "Java12");
        String[] sampleArray = sampleList.toArray(String[]::new);
        assertThat(sampleArray).containsExactly("Java9", "Java10", "Java11", "Java12");
    }
}
