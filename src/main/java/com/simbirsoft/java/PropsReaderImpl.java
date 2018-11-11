package com.simbirsoft.java;

import java.io.*;
import java.util.Properties;

public class PropertiesLayer implements PropsReader {

    Properties property = new Properties();
    final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(PropertiesLayer.class);

    public PropertiesLayer() {
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

    public InfoForResumeTest getInfoForResume() {

        InfoForResumeTest infoForResumeTest = new InfoForResumeTest(

                property.getProperty("FIO"),
                property.getProperty("DOB"),
                property.getProperty("MOBILE"),
                property.getProperty("EMAIL"),
                property.getProperty("SKYPE"),
                property.getProperty("AVATAR"),
                property.getProperty("TARGET"),
                property.getProperty("EXPERIENCE"),
                property.getProperty("COURSES"),
                property.getProperty("EDUCATION"),
                property.getProperty("SKILLS"),
                property.getProperty("EXEMPLECODE")

        );
        return infoForResumeTest;
    }
}



