package com.jaydot2.security.secureapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();

        return docket;
    }

    /**
     * <p>
     *     Basic information about the API
     * </p>
     * @return
     */
    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("Secure APIs")
                .description("A collection of of APIs demonstrating API security")
                .license("MIT")
                .licenseUrl("https://opensource.org/licenses/MIT")
                .version("1.0")
                .termsOfServiceUrl("None")
                .contact(new Contact("Admin", "http://www.jaydot2.com", "jaydot2llc@gmail.com"))
                .build();

        return apiInfo;
    }
}
