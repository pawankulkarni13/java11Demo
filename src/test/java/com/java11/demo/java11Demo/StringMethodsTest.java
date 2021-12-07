package com.java11.demo.java11Demo;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringMethodsTest {

    @Test
    public void new_String_Methods(){

        String str = "Welcome to Java \n This demonstrates \n String utility \n methods.";
        List<String> lines = str.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
        assertThat(lines).containsExactly("Welcome to Java", "This demonstrates", "String utility", "methods.");

    }

    @Test
    public void strip_Trim_Difference(){
        /**
         * strip*() determines whether the character is whitespace or not based on Character.isWhitespace().
         * In other words, it is aware of Unicode whitespace characters.
         * This is different from trim(), which defines space as any character that is less than or equal to the Unicode space character (U+0020).
         * If we use trim() in the previous example, we will get a different result:
         */
        is("\n\t  java11   \u2005".trim()).equals("java11   \u2005");

    }

    @Test
    public void isBlank_Method(){

        assertTrue(" ".isBlank());
        assertFalse(" ".isEmpty()); //See the difference ?

        assertTrue("\n\t\u2005  ".isBlank());
    }

}
