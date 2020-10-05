package com.learning.restfulwebservices;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String sayHello(){
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hellobean")
    public HelloWorldBean sayHelloBean(){
        return new HelloWorldBean("Hellow World");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hello/pathvariable/{name}")
    public HelloWorldBean sayHelloPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hellow World %s",name));
    }
}
