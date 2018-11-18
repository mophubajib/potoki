package com.simbirsoft.java;

import java.util.Comparator;
import java.util.Map;


class SkillsValueComparator implements Comparator<String> {

    Map<String, Integer> base;


    public SkillsValueComparator(Map<String, Integer> base) {
        this.base = base;
    }

    public int compare(String a, String b) {
        if (base.get(a) >= (base.get(b))) {
            return -1;
        } else {
            return 1;
        }
    }
}
