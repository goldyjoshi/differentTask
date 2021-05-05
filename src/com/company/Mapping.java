package com.company;

import java.util.HashMap;
import java.util.Map;

public class Mapping {

    private Map<String, Integer> strToInt;

    public Mapping(Map strToInt) {
        this.strToInt = strToInt;
    }

    public int getMapping(String strNumber) {
        return strToInt.get(strNumber);
    }

}
