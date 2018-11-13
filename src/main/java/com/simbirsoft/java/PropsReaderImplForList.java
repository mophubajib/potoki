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

    public List <String>  skilllist() {
        List skilllist = new ArrayList();
        String foundSkills;
        foundSkills = String.valueOf(property.getProperty("SKILLS"));
        String[] foundSkillsparts = foundSkills.split(",");
        for (Object ob : foundSkillsparts) {
            skilllist.add(ob);
        }
        return skilllist;}

    }










