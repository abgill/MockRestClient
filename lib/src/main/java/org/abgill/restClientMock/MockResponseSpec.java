package org.abgill.restClientMock;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestClient;

import java.util.function.Predicate;

public class MockResponseSpec implements RestClient.ResponseSpec {
    @Override
    public RestClient.ResponseSpec onStatus(Predicate<HttpStatusCode> statusPredicate, ErrorHandler errorHandler) {
        return null;
    }

    @Override
    public RestClient.ResponseSpec onStatus(ResponseErrorHandler errorHandler) {
        return null;
    }

    @Override
    public <T> T body(Class<T> bodyType) {
        return null;
    }

    @Override
    public <T> T body(ParameterizedTypeReference<T> bodyType) {
        return null;
    }

    @Override
    public <T> ResponseEntity<T> toEntity(Class<T> bodyType) {
        return null;
    }

    @Override
    public <T> ResponseEntity<T> toEntity(ParameterizedTypeReference<T> bodyType) {
        return null;
    }

    @Override
    public ResponseEntity<Void> toBodilessEntity() {
        return null;
    }
}
