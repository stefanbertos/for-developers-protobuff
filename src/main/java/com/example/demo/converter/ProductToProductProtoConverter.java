package com.example.demo.converter;

import com.example.demo.entity.Product;
import com.example.demo.protos.ProductProtos;
import org.springframework.core.convert.converter.Converter;

public class ProductToProductProtoConverter implements Converter<Product, ProductProtos.Product> {
    @Override
    public ProductProtos.Product convert(Product source) {
        return ProductProtos
                .Product
                .newBuilder()
                .setProductId(source.getId())
                .setProductName(source.getName())
                .setProductDescription(source.getDescription())
                .setProductPrice(source.getPrice())
                .setProductCategory(ProductProtos.ProductCategory.valueOf(source.getCategory()))
                .setProductImage(source.getImage())
                .build();
    }
}