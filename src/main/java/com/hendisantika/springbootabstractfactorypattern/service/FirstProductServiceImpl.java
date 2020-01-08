package com.hendisantika.springbootabstractfactorypattern.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-abstract-factory-pattern
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/01/20
 * Time: 05.53
 */
@Description(value = "FirstProduct implementation.")
@Service
public class FirstProductServiceImpl implements ProductService {

    private final Logger logger = LoggerFactory.getLogger(FirstProductServiceImpl.class);

    @Override
    public void setTitle(String title) {
        logger.info("Setting first product title...");
    }

    @Override
    public void calculateSomething() {
        logger.info("Calculating something for first product...");
    }
}