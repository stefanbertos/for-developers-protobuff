package com.example.demo;

import com.example.demo.protos.ProductProtos;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(
        webEnvironment = RANDOM_PORT, classes = Application.class)
class ProtobufTest {
    public static final int DEFAULT_PRODUCT_ID = 1;
    @Autowired
    private WebTestClient testClient;

    @Test
    void on_create_and_get_should_return_valid_object() {
        ProductProtos.Product product = ProductProtos.Product.newBuilder()
                .setProductId(DEFAULT_PRODUCT_ID)
                .setProductName("Apple")
                .setProductDescription("Green apple")
                .setProductCategory(ProductProtos.ProductCategory.FOOD)
                .setProductImage("http://green-apple-just-fake-url.com")
                .setProductPrice(1.99f)
                .build();

        testClient.post()
                .uri("/v1/product")
                .body(Mono.just(product), ProductProtos.Product.class)
                .exchange()
                .expectStatus().isCreated();

        testClient.get()
                .uri("/v1/product/" + DEFAULT_PRODUCT_ID)
                .exchange()
                .expectStatus().isOk()
                .expectBody(ProductProtos.Product.class).isEqualTo(product);
    }
}