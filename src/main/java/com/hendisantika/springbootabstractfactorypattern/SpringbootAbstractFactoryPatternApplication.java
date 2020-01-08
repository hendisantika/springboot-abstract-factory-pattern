package com.hendisantika.springbootabstractfactorypattern;

import com.hendisantika.springbootabstractfactorypattern.builder.ProductBuilder;
import com.hendisantika.springbootabstractfactorypattern.factory.AbstractProductFactory;
import com.hendisantika.springbootabstractfactorypattern.factory.FirstProductFactoryImpl;
import com.hendisantika.springbootabstractfactorypattern.factory.SecondProductFactoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootAbstractFactoryPatternApplication {
    private static String productType = "FIRST_PRODUCT";

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAbstractFactoryPatternApplication.class, args);
        // product builder instance
        ProductBuilder productBuilder = new ProductBuilder();

        // deciding which product implementation to use...
        AbstractProductFactory abstractProductFactory;
        if (productType.contentEquals("FIRST_PRODUCT")) {
            abstractProductFactory = new FirstProductFactoryImpl();
        } else {
            abstractProductFactory = new SecondProductFactoryImpl();
        }

        // build product...
        productBuilder.buildProduct(abstractProductFactory);
    }

}
