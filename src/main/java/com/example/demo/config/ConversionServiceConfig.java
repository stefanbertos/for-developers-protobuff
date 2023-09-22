package com.example.demo.config;

import com.example.demo.converter.ProductProtoToProductConverter;
import com.example.demo.converter.ProductToProductProtoConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@Configuration
public class ConversionServiceConfig {
    @Bean
    public ConversionService conversionService() {
        var conversionService = new DefaultConversionService();
        conversionService.addConverter(new ProductProtoToProductConverter());
        conversionService.addConverter(new ProductToProductProtoConverter());
        return conversionService;
    }
}
