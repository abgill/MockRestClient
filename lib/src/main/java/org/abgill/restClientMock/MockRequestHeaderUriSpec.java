package org.abgill.restClientMock;

import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;

import java.net.URI;
import java.nio.charset.Charset;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class MockRequestHeaderUriSpec implements RestClient.RequestHeadersUriSpec {
    @Override
    public RestClient.RequestHeadersSpec<?> accept(MediaType... acceptableMediaTypes) {
        return null;
    }

    @Override
    public RestClient.RequestHeadersSpec acceptCharset(Charset... acceptableCharsets) {
        return null;
    }

    @Override
    public RestClient.RequestHeadersSpec cookie(String name, String value) {
        return null;
    }

    @Override
    public RestClient.RequestHeadersSpec ifModifiedSince(ZonedDateTime ifModifiedSince) {
        return null;
    }

    @Override
    public RestClient.RequestHeadersSpec ifNoneMatch(String... ifNoneMatches) {
        return null;
    }

    @Override
    public RestClient.RequestHeadersSpec header(String headerName, String... headerValues) {
        return null;
    }

    @Override
    public RestClient.RequestHeadersSpec attribute(String name, Object value) {
        return null;
    }

    @Override
    public RestClient.ResponseSpec retrieve() {
        return null;
    }

    @Override
    public Object exchange(ExchangeFunction exchangeFunction, boolean close) {
        return null;
    }

    @Override
    public RestClient.RequestHeadersSpec httpRequest(Consumer consumer) {
        return null;
    }

    @Override
    public RestClient.RequestHeadersSpec attributes(Consumer attributesConsumer) {
        return null;
    }

    @Override
    public RestClient.RequestHeadersSpec headers(Consumer consumer) {
        return null;
    }

    @Override
    public RestClient.RequestHeadersSpec cookies(Consumer cookiesConsumer) {
        return null;
    }

    @Override
    public RestClient.RequestHeadersSpec<?> uri(URI uri) {
        return null;
    }

    @Override
    public RestClient.RequestHeadersSpec<?> uri(String uri, Object... uriVariables) {
        return null;
    }

    @Override
    public RestClient.RequestHeadersSpec<?> uri(Function function) {
        return null;
    }

    @Override
    public RestClient.RequestHeadersSpec<?> uri(String uri, Function function) {
        return null;
    }

    @Override
    public RestClient.RequestHeadersSpec<?> uri(String uri, Map uriVariables) {
        return null;
    }
}
