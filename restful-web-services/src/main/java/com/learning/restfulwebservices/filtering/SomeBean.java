package com.learning.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFilter("SomeBeanFilter")
public class SomeBean {
    public SomeBean(String value1, String value2, String value3) {
        this.valueOne = value1;
        this.valueTwo = value2;
        this.valueThree = value3;
    }
    private String valueOne;
    private String valueTwo;
    //@JsonIgnore
    private String valueThree;

    public String getValueOne() {
        return valueOne;
    }

    public void setValueOne(String valueOne) {
        this.valueOne = valueOne;
    }

    public String getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(String valueTwo) {
        this.valueTwo = valueTwo;
    }

    public String getValueThree() {
        return valueThree;
    }

    public void setValueThree(String valueThree) {
        this.valueThree = valueThree;
    }
}
