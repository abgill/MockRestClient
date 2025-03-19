package org.abgill.restClientMock;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriBuilder;

import java.net.URI;
import java.nio.charset.Charset;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class MockRequestBodyUriSpec implements RestClient.RequestBodyUriSpec {
    @Override
    public RestClient.RequestBodySpec contentLength(long contentLength) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec contentType(MediaType contentType) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec body(Object body) {
        return null;
    }

    @Override
    public <T> RestClient.RequestBodySpec body(T body, ParameterizedTypeReference<T> bodyType) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec body(StreamingHttpOutputMessage.Body body) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec accept(MediaType... acceptableMediaTypes) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec acceptCharset(Charset... acceptableCharsets) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec cookie(String name, String value) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec cookies(Consumer<MultiValueMap<String, String>> cookiesConsumer) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec ifModifiedSince(ZonedDateTime ifModifiedSince) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec ifNoneMatch(String... ifNoneMatches) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec header(String headerName, String... headerValues) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec headers(Consumer<HttpHeaders> headersConsumer) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec attribute(String name, Object value) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec attributes(Consumer<Map<String, Object>> attributesConsumer) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec httpRequest(Consumer<ClientHttpRequest> requestConsumer) {
        return null;
    }

    @Override
    public RestClient.ResponseSpec retrieve() {
        return null;
    }

    @Override
    public <T> T exchange(ExchangeFunction<T> exchangeFunction, boolean close) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec uri(URI uri) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec uri(String uri, Object... uriVariables) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec uri(String uri, Map<String, ?> uriVariables) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec uri(String uri, Function<UriBuilder, URI> uriFunction) {
        return null;
    }

    @Override
    public RestClient.RequestBodySpec uri(Function<UriBuilder, URI> uriFunction) {
        return null;
    }
}
