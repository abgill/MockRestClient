package org.abgill.restClientMock;

import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

public interface MockableRestClient extends RestClient, Mockable {


    // The following methods are not supported.
    static RestClient create() {
        throw new NotSupportedException();
    }


    static RestClient create(String baseUrl) {
        throw new NotSupportedException();
    }

    static RestClient create(URI baseUrl) {
        throw new NotSupportedException();
    }

    static RestClient create(RestTemplate restTemplate) {
        throw new NotSupportedException();
    }

    static RestClient.Builder builder() {
        throw new NotSupportedException();
    }

    static RestClient.Builder builder(RestTemplate restTemplate) {
        throw new NotSupportedException();
    }
}
