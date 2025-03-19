package org.abgill.restClientMock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;

import static org.junit.jupiter.api.Assertions.*;

class RestClientMockTest {

    RestClient restClientMock;

    @BeforeEach
    void setup() {
        restClientMock = new MockRestClientBuilder().build();
    }

    @Test
    void shouldGet() {
        restClientMock.method(HttpMethod.GET)
                .header("header", "someHeader")
                .body(new Object())
                .contentType(MediaType.APPLICATION_JSON)
                .contentLength(100)
                .retrieve()
                .toEntity(Object.class);
    }

}