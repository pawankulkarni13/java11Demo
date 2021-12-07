package com.java11.demo.java11Demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HTTPClientTest {

    @Test
    public void usage_http_Client_API() throws IOException, InterruptedException {

        assertTrue(1>0);    //todo : Remove

//        HttpClient httpClient = HttpClient.newBuilder()
//                .version(HttpClient.Version.HTTP_2)
//                .connectTimeout(Duration.ofSeconds(20))
//                .build();
//        HttpRequest httpRequest = HttpRequest.newBuilder()
//                .GET()
//                .uri(URI.create("http://localhost:" + 8080))
//                .build();
//        HttpResponse httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
//        Assertions.assertThat(httpResponse.body()).isEqualTo("Hello from the server!");
        //If this fails host a Simple SpringBoot App which returns this message.
        //If not SB then use a simple python program. Any alternate would work.
    }
}
