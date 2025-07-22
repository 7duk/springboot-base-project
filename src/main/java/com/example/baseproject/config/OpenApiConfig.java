package com.example.baseproject.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = {"dev", "test"})
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi groupedPublicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/api/**")
                .build();
    }

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Base Project API")
                        .description("This is the API document for base project!")
                        .version("1.0")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://springdoc.org"))
                        .contact(new Contact()
                                .name("7duk")
                                .email("...@gmail.com")
                                .url("https://github.com/7duk"))
                );
    }
}
