package com.simbirsoft.java;

import java.util.Objects;

public class Skill {

    public String getSkillForMap() {
        return skillForMap;
    }

    public void setSkillForMap(String skillForMap) {
        this.skillForMap = skillForMap;
    }

    public int getValueForMap() {
        return valueForMap;
    }

    public void setValueForMap(int valueForMap) {
        this.valueForMap = valueForMap;
    }

    @Override
    public String toString() {
        return skillForMap + valueForMap;
    }


    public Skill(String skillForMap, int valueForMap) {
        this.skillForMap = skillForMap;
        this.valueForMap = valueForMap;
    }

    String skillForMap;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return Objects.equals(valueForMap, skill.valueForMap);
    }

    @Override
    public int hashCode() {

        return Objects.hash(valueForMap);
    }

    int valueForMap ;



}
