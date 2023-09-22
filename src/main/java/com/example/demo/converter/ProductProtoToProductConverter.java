package com.example.demo.converter;

import com.example.demo.entity.Product;
import com.example.demo.protos.ProductProtos;
import org.springframework.core.convert.converter.Converter;

public class ProductProtoToProductConverter implements Converter<ProductProtos.Product, Product> {
    @Override
    public Product convert(ProductProtos.Product source) {
        var product = new Product();
        product.setName(source.getProductName());
        product.setDescription(source.getProductDescription());
        product.setPrice(source.getProductPrice());
        product.setCategory(source.getProductCategory().name());
        product.setImage(source.getProductImage());
        return product;
    }
}