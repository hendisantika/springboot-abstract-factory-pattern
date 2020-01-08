package com.hendisantika.springbootabstractfactorypattern.builder;

import com.hendisantika.springbootabstractfactorypattern.factory.AbstractProductFactory;
import com.hendisantika.springbootabstractfactorypattern.service.ProductService;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-abstract-factory-pattern
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/01/20
 * Time: 05.55
 */
@Description(value = "Product builder component.")
@Component
public class ProductBuilder {

    public void buildProduct(AbstractProductFactory productFactory) {
        ProductService productService = productFactory.createProduct();
        productService.setTitle("Some title");
        productService.calculateSomething();
    }

}