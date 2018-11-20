package com.simbirsoft.java;

import java.io.*;
import java.util.*;

public class PropsReaderImpl extends Thread implements PropsReader {

    public Properties getProperty() {
        return property;
    }

    public void setProperty(Properties property) {
        this.property = property;
    }

    Properties property = new Properties();


    final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(PropsReaderImpl.class);




    List <String> listInfo = new ArrayList();



    @Override
    public void run() {
        try {
            property.load(new InputStreamReader(new FileInputStream("propertiesForSimbirsoft1.properties"), "windows-1251"));

        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл настроек");
            logger.info("Не найден файл настроек");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.listInfo.add(property.getProperty("FIO"));
        this.listInfo.add(property.getProperty("DOB"));
        this.listInfo.add(property.getProperty("MOBILE"));
        this.listInfo.add(property.getProperty("EMAIL"));
        this.listInfo.add(property.getProperty("SKYPE"));
        this.listInfo.add(property.getProperty("AVATAR"));
        this.listInfo.add(property.getProperty("TARGET"));
        this.listInfo.add(property.getProperty("EXPERIENCE"));
        this.listInfo.add(property.getProperty("COURSES"));
        this.listInfo.add(property.getProperty("EDUCATION"));
        this.listInfo.add(property.getProperty("SKILLS"));
        this.listInfo.add(property.getProperty("EXEMPLECODE"));



//        System.out.println(listInfo.size());
    }

    public List<String> getListInfo() {
        return listInfo;
    }

    public void setListInfo(List<String> listInfo) {
        this.listInfo = listInfo;
    }
//
    @Override
    public InfoForResumeTest getInfoForResume() {

        System.out.println(listInfo.size());

        InfoForResumeTest infoForResumeTest = new InfoForResumeTest(
                String.valueOf(listInfo.get(0)),
                String.valueOf(listInfo.get(1)),
                String.valueOf(listInfo.get(2)),
                String.valueOf(listInfo.get(3)),
                String.valueOf(listInfo.get(4)),
                String.valueOf(listInfo.get(5)),
                String.valueOf(listInfo.get(6)),
                String.valueOf(listInfo.get(7)),
                String.valueOf(listInfo.get(8)),
                String.valueOf(listInfo.get(9)),
                String.valueOf(listInfo.get(10)),
                String.valueOf(listInfo.get(11)));
//
//                "123",
//                "123",
//                "123",
//                "123","123",
//                "123",
//                "123",
//                "123",
//                "123",
//                "123",
//                "123",
//                "123");
//
//
//
//
//
        return infoForResumeTest;
    }

    //
//
//    public Properties getProperty() {
//        return property;
//    }

//
//    public InfoForResumeTest getInfoForResume() {
//
////        System.out.println(getProperty().getProperty("FIO"));
//
//        InfoForResumeTest infoForResumeTest = new InfoForResumeTest(
//
//                property.getProperty("FIO"),
//                property.getProperty("DOB"),
//                property.getProperty("MOBILE"),
//                property.getProperty("EMAIL"),
//                property.getProperty("SKYPE"),
//                property.getProperty("AVATAR"),
//                property.getProperty("TARGET"),
//                property.getProperty("EXPERIENCE"),
//                property.getProperty("COURSES"),
//                property.getProperty("EDUCATION"),
//                property.getProperty("SKILLS"),
//                property.getProperty("EXEMPLECODE")
//
//        );
//        return infoForResumeTest;
//    }
}



