package com.hendisantika.springbootabstractfactorypattern.service;

import org.springframework.context.annotation.Description;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-abstract-factory-pattern
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/01/20
 * Time: 05.52
 */

@Description(value = "Definition of product methods.")
public interface ProductService {

    void setTitle(String title);

    void calculateSomething();

}