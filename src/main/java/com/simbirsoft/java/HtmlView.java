package com.simbirsoft.java;


import javax.swing.*;
import java.io.*;

public class HtmlView extends SimpleWindow implements View {

    String stringHtmltest = null;
    final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(HtmlView.class);

//    public void createHtml(PropsReaderImpl propsReader) {
public void createHtml(InfoForResumeTest infoForResumeTest) {
//    PropsReaderImpl propsReader= new PropsReaderImpl();

//    InfoForResumeTest infoForResumeTest = new InfoForResumeTest();

//    propsReader.getInfoForResumeTest();


        stringHtmltest = "<meta charset=\"UTF-8\"><body><h1 align=\"center\">Резюме</h1><p align=\"center\">На должность Java-стажер.</p>\n<table align=\"center\">\n    <tr><tr>\n    <th align=\"right\">   ФИО:  </th><th align=\"left\">" + infoForResumeTest.getFio() + "</th><td rowspan =\"5\" width=\"500\" align=\"right\"><p><img width=\"195\" height=\"260\" src=\"" + infoForResumeTest.getAvatar() + "\"></p></td>\n</tr>\n    <tr>\n        <th align=\"right\">Дата рождения:</th><th align=\"left\">" + infoForResumeTest.getDob() + "</th>\n    </tr>\n    <tr>\n        <th align=\"right\">Телефон:</th><th align=\"left\">" + infoForResumeTest.getMobile() + "</th>\n    </tr>\n    <tr>\n        <th align=\"right\"> e-mail:</th><th align=\"left\">" + infoForResumeTest.getEmail() + "</th>\n    </tr>\n    <tr>\n        <th align=\"right\">Skype:</th><th align=\"left\">" + infoForResumeTest.getSkype() + "</th>\n    </tr>\n</table>\n<h2>Цель:</h2>\n<p>" + infoForResumeTest.getTarget() + "</p>\n<h2>Опыт работы:</h2>\n<p>" + infoForResumeTest.getExperience() + "</p>\n<h2>Образование:</h2>\n<p>" + infoForResumeTest.getEducation() + "</p>\n<h2>Доп. образование и курсы:</h2>\n<p>" + infoForResumeTest.getCourses() + "</p>\n<h2>Навыки:</h2>\n<p>" + infoForResumeTest.getSkills() + "</p>\n<h2>Пример кода:</h2>\n<p>" + infoForResumeTest.getExemplecode() + "</p>\n</body></html>";

        JFrame myWindow = new SimpleWindow();
        myWindow.setVisible(true);

        try {

            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("resumeForSimbirsoftFrom.html"), "UTF-8"));
            out.write(stringHtmltest);
            out.flush();
            out.close();
            logger.info("Html страница создана");
            myWindow.add(new JButton("HTML страница создана."));

        } catch (IOException var18) {
            logger.info("Ошибка при записи");
            System.out.print("Ошибка при записи");
            myWindow.add(new JButton("Ошибка при записи."));
            return;
        }

    }
}
