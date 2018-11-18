package com.simbirsoft.java;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.io.*;
import java.util.*;

public class MapForSkills {


    Map<String, Integer> mapForSkills = new TreeMap<String, Integer>();

    PropsReaderImplForList propsReaderImplForList = new PropsReaderImplForList();
    List listSkillsForMap = propsReaderImplForList.skillList();
    List listValueForMap = propsReaderImplForList.valueList();


    Skill skill = new Skill(String.valueOf(listSkillsForMap.get(0)), (Integer) (listValueForMap.get(0)));
    Skill skill1 = new Skill(String.valueOf(listSkillsForMap.get(1)), (Integer) (listValueForMap.get(1)));
    Skill skill2 = new Skill(String.valueOf(listSkillsForMap.get(2)), (Integer) (listValueForMap.get(2)));
    Skill skill3 = new Skill(String.valueOf(listSkillsForMap.get(3)), (Integer) (listValueForMap.get(3)));
    Skill skill4 = new Skill(String.valueOf(listSkillsForMap.get(4)), (Integer) (listValueForMap.get(4)));

    public List sortList() {

        SkillsValueComparator bvc = new SkillsValueComparator(mapForSkills);
        TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(bvc);

        mapForSkills.put(String.valueOf(skill.getSkillForMap()),(skill.getValueForMap()));
        mapForSkills.put(String.valueOf(skill1.getSkillForMap()),(skill1.getValueForMap()));
        mapForSkills.put(String.valueOf(skill2.getSkillForMap()),(skill2.getValueForMap()));
        mapForSkills.put(String.valueOf(skill3.getSkillForMap()),(skill3.getValueForMap()));
        mapForSkills.put(String.valueOf(skill4.getSkillForMap()),(skill4.getValueForMap()));

        sorted_map.putAll(mapForSkills);
        List sortList = new ArrayList(sorted_map.entrySet());


        return sortList;
    }


}
