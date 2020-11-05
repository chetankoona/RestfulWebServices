package com.learning.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

    @GetMapping("/v1/person")
    public PersonV1 getPersonV1(){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping("/v2/person")
    public PersonV2 getPersonV2(){
        return new PersonV2(new Name("Bob","Charlie"));
    }

    @GetMapping(value = "/person/param",params = "version=1")
    public PersonV1 getPersonParamV1(){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(value = "/person/param",params = "version=2")
    public PersonV2 getPersonParamV2(){
        return new PersonV2(new Name("Bob","Charlie"));
    }

    @GetMapping(value = "/person/header",headers = "X-API-VERSION=1")
    public PersonV1 getPersonHeaderV1(){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(value = "/person/header",headers = "X-API-VERSION=2")
    public PersonV2 getPersonHeaderV2(){
        return new PersonV2(new Name("Bob","Charlie"));
    }

    @GetMapping(value = "/person/produces",produces = "application/v1+json")
    public PersonV1 getPersonProducesV1(){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(value = "/person/produces",produces = "application/v2+json")
    public PersonV2 getPersonProducesV2(){
        return new PersonV2(new Name("Bob","Charlie"));
    }
}
