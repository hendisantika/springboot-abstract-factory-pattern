package com.hendisantika.springbootabstractfactorypattern.factory;

import com.hendisantika.springbootabstractfactorypattern.service.ProductService;
import com.hendisantika.springbootabstractfactorypattern.service.SecondProductServiceImpl;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-abstract-factory-pattern
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/01/20
 * Time: 05.54
 */
@Description(value = "Concrete implementation of product factory.")
@Service
public class SecondProductFactoryImpl implements AbstractProductFactory {

    @Override
    public ProductService createProduct() {
        return new SecondProductServiceImpl();
    }
}