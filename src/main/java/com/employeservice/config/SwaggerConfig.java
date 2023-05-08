//package com.employeservice.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.service.StringVendorExtension;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.List;
//
//import static springfox.documentation.builders.PathSelectors.regex;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    @Bean
//    public Docket moviesAPI(){
//
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.employeservice.controller"))
////                .paths(regex("/*"))
//                .apis(RequestHandlerSelectors.any())
//                .build()
//                .apiInfo(apiInfo());
//    }
//
//
//    private ApiInfo apiInfo() {
//
//        Contact contact = new Contact("Dilip Sundarraj Youtube Channel","https://www.youtube.com/codewithdilip","");
//
//        StringVendorExtension listVendorExtension = new StringVendorExtension("Code With Dilip", "Online Instructor");
//        return new ApiInfo("Employee RestFul Service API","Employee RestFul Service",
//                "1.0","", contact, "Employee RestFul Service- Source Code" ,"https://github.com/",
//                List.of(listVendorExtension));
//    }
///*@Bean
//public Docket api() {
//    return new Docket(DocumentationType.SWAGGER_2)
//            .select()
//            .apis(RequestHandlerSelectors.basePackage("com.employeservice.controller"))
//            .paths(PathSelectors.any())
//            .build()
//            .apiInfo(apiInfo());
//}
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Employee Service API")
//                .description("REST API for managing employees")
//                .version("1.0.0")
//                .build();
//    }*/
//}
