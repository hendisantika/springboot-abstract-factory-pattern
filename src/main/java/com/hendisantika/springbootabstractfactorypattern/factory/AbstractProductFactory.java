package com.hendisantika.springbootabstractfactorypattern.factory;

import com.hendisantika.springbootabstractfactorypattern.service.ProductService;
import org.springframework.context.annotation.Description;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-abstract-factory-pattern
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/01/20
 * Time: 05.51
 */
@Description(value = "Product Factory - Creational Factory.")
public interface AbstractProductFactory {

    ProductService createProduct();

}