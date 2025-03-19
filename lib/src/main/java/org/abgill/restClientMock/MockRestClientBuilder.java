package org.abgill.restClientMock;

import io.micrometer.observation.ObservationRegistry;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInitializer;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.observation.ClientRequestObservationConvention;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriBuilderFactory;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MockRestClientBuilder implements RestClient.Builder {

    private URI baseUrl;
    private Map<String, ?> defaultUriVariables;
    private UriBuilderFactory uriBuilderFactory;
    private HttpHeaders defaultHeaders = new HttpHeaders();
    private MultiValueMap<String, String> defaultCookies = new LinkedMultiValueMap<>();

    @Override
    public RestClient.Builder baseUrl(String baseUrl) {
        this.baseUrl = URI.create(baseUrl);
        return this;
    }

    @Override
    public RestClient.Builder baseUrl(URI baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    @Override
    public RestClient.Builder defaultUriVariables(Map<String, ?> defaultUriVariables) {
        this.defaultUriVariables = defaultUriVariables;
        return this;
    }

    @Override
    public RestClient.Builder uriBuilderFactory(UriBuilderFactory uriBuilderFactory) {
        this.uriBuilderFactory = uriBuilderFactory;
        return this;
    }

    @Override
    public RestClient.Builder defaultHeader(String header, String... values) {
        this.defaultHeaders.put(header, Arrays.asList(values));
        return this;
    }

    @Override
    public RestClient.Builder defaultHeaders(Consumer<HttpHeaders> headersConsumer) {
        headersConsumer.accept(defaultHeaders);
        return this;
    }

    @Override
    public RestClient.Builder defaultCookie(String cookie, String... values) {
        this.defaultCookies.addAll(cookie, Arrays.asList(values));
        return this;
    }

    @Override
    public RestClient.Builder defaultCookies(Consumer<MultiValueMap<String, String>> cookiesConsumer) {
        cookiesConsumer.accept(defaultCookies);
        return this;
    }

    @Override
    public RestClient.Builder defaultRequest(Consumer<RestClient.RequestHeadersSpec<?>> defaultRequest) {
        throw new NotSupportedException(); //TODO: Implement this later
    }

    @Override
    public RestClient.Builder defaultStatusHandler(Predicate<HttpStatusCode> statusPredicate, RestClient.ResponseSpec.ErrorHandler errorHandler) {
        throw new NotSupportedException(); //TODO: Implement this later
    }

    @Override
    public RestClient.Builder defaultStatusHandler(ResponseErrorHandler errorHandler) {
        throw new NotSupportedException(); //TODO: Implement this later
    }

    @Override
    public RestClient.Builder requestInterceptor(ClientHttpRequestInterceptor interceptor) {
        throw new NotSupportedException(); //TODO: Implement this later
    }

    @Override
    public RestClient.Builder requestInterceptors(Consumer<List<ClientHttpRequestInterceptor>> interceptorsConsumer) {
        throw new NotSupportedException(); //TODO: Implement this later
    }

    @Override
    public RestClient.Builder requestInitializer(ClientHttpRequestInitializer initializer) {
        throw new NotSupportedException(); //TODO: Implement this later
    }

    @Override
    public RestClient.Builder requestInitializers(Consumer<List<ClientHttpRequestInitializer>> initializersConsumer) {
        throw new NotSupportedException(); //TODO: Implement this later
    }

    @Override
    public RestClient.Builder requestFactory(ClientHttpRequestFactory requestFactory) {
        throw new NotSupportedException(); //TODO: Implement this later
    }

    @Override
    public RestClient.Builder messageConverters(Consumer<List<HttpMessageConverter<?>>> configurer) {
        throw new NotSupportedException(); //TODO: Implement this later
    }

    @Override
    public RestClient.Builder messageConverters(List<HttpMessageConverter<?>> messageConverters) {
        throw new NotSupportedException(); //TODO: Implement this later
    }

    @Override
    public RestClient.Builder observationRegistry(ObservationRegistry observationRegistry) {
        throw new NotSupportedException(); //TODO: Implement this later
    }

    @Override
    public RestClient.Builder observationConvention(ClientRequestObservationConvention observationConvention) {
        throw new NotSupportedException(); //TODO: Implement this later
    }

    @Override
    public RestClient.Builder apply(Consumer<RestClient.Builder> builderConsumer) {
        throw new NotSupportedException(); //TODO: Implement this later
    }

    @Override
    public RestClient.Builder clone() {
        throw new NotSupportedException(); //TODO: Implement this later
    }

    public RestClient build() {
        return new RestClientMock();
    }
}