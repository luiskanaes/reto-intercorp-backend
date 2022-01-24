package com.client.example.config;

import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .host("34.73.56.49:80")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.client.example.controller"))
                .paths(PathSelectors.any())
                .build();
    }
                
    private ApiInfo apiInfo(){
        return new ApiInfo(
                "Api Rest",
                "Descripción",
                "2.0",
                "Términos y Condiciones",
                new Contact("Juan Diego", "", "jdcaceres12@outlook.com"),
                "Licencia",
                "www.licencia.com",
                Collections.emptyList()
        );
    }
}
