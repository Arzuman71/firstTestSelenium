package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FirstTest extends WebDriverSettings {

    @Test
    public void firstTest() {

        driver.get("https://proselyte.net/tutorials/spring-tutorial-full-version/spring-mvc-framework/");
        String title = driver.getTitle();
        Assertions.assertEquals(title, "Руководство по Spring. Spring MVC Framework (основы). – PROSELYTE");
    }

}
