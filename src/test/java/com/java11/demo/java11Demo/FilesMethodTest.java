package com.java11.demo.java11Demo;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

public class FilesMethodTest {

    @Test
    public void file_method_writeString_ReadString() throws IOException {
        Path filePath = Files.writeString(Files.createTempFile("testDemo", ".txt"), "Sample hello text from Java11");
        String fileContent = Files.readString(filePath);
        assertThat(fileContent).isEqualTo("Sample hello text from Java11");
    }
}
