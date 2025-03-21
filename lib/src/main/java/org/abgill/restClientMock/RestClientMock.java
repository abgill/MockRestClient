package org.abgill.restClientMock;

import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

public class RestClientMock implements MockableRestClient {

    @Override
    public RequestHeadersUriSpec<?> get() {
        return new MockRequestHeaderUriSpec();
    }

    @Override
    public RequestHeadersUriSpec<?> head() {
        return new MockRequestHeaderUriSpec();
    }

    @Override
    public RequestBodyUriSpec post() {
        return new MockRequestBodyUriSpec();
    }

    @Override
    public RequestBodyUriSpec put() {
        return null;
    }

    @Override
    public RequestBodyUriSpec patch() {
        return null;
    }

    @Override
    public RequestHeadersUriSpec<?> delete() {
        return null;
    }

    @Override
    public RequestHeadersUriSpec<?> options() {
        return null;
    }

    @Override
    public RequestBodyUriSpec method(HttpMethod method) {
        return null;
    }

    @Override
    public Builder mutate() {
        return null;
    }







}
