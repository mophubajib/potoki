package com.simbirsoft.java;

import java.io.*;
import java.util.*;

public class PropsReaderImplForList {


    Properties property = new Properties();
    final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(com.simbirsoft.java.PropsReaderImpl.class);


    public PropsReaderImplForList() {
        property = getProperties();
    }

    public Properties getProperties() {
        try {
            property.load(new InputStreamReader(new FileInputStream("propertiesForSimbirsoft.properties"), "windows-1251"));
            return property;
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл настроек");
            logger.info("Не найден файл настроек");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> skillList() {

        List skillList = new ArrayList();
        String foundSkills;
        foundSkills = String.valueOf(property.getProperty("SKILLS"));
        String[] foundSkillsParts = foundSkills.split("-?[\\d,  ,^-]+;");
        for (Object ob : foundSkillsParts) {
            skillList.add(ob);
        }
        skillList.removeAll(Arrays.asList("", null));

        return skillList;
    }

    public List<Integer> valueList() {

        List<Integer> valueList = new ArrayList();
        String foundValue;
        foundValue = String.valueOf(property.getProperty("SKILLS"));
        String[] foundValueParts = foundValue.split("-?[A-я, ,;,:]+");
        int numArr[] = new int[foundValueParts.length];
        for (int i = 0; i < foundValueParts.length; i++) {
            try {
                numArr[i] = Integer.parseInt(foundValueParts[i]);
            } catch (NumberFormatException nfe) {
            }
        }
        for (int i = 0; i < numArr.length; i++) {
            valueList.add(numArr[i]);
        }

        valueList.removeAll(Arrays.asList("", null, 0));
        return valueList;
    }
}














