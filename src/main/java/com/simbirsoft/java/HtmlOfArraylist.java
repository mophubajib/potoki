package com.simbirsoft.java;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;


public class HtmlOfArraylist extends SimpleWindow implements View {

    final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(HtmlOfArraylist.class);
    private ArrayList<String> collection = new ArrayList<String>();


    public void createHtml(InfoForResumeTest infoForResumeTest) {
        JFrame myWindow = new SimpleWindow();
        myWindow.setVisible(true);

        try {
            this.collection.add("<meta charset=\"UTF-8\"><body><h1 align=\"center\">Резюме</h1><p align=\"center\">На должность Java-стажер.</p>");
            this.collection.add("<table align=\"center\">");
            this.collection.add("<tr><tr>");
            this.collection.add("    <th align=\"right\">   ФИО:  </th><th align=\"left\">");
            this.collection.add(String.valueOf(infoForResumeTest.getFio()));
            this.collection.add("</th><td rowspan =\"5\" width=\"500\" align=\"right\"><p><img width=\"195\" height=\"260\" src=");
            this.collection.add(String.valueOf(infoForResumeTest.getAvatar()));
            this.collection.add("></p></td>");
            this.collection.add("</tr>\n" +
                    "    <tr>");
            this.collection.add("<th align=\"right\">Дата рождения:</th><th align=\"left\">");
            this.collection.add(String.valueOf(infoForResumeTest.getDob()));
            this.collection.add("</th>\n" +
                    "    </tr>\n" +
                    "    <tr>\n" +
                    "        <th align=\"right\">Телефон:</th><th align=\"left\">");
            this.collection.add(String.valueOf(infoForResumeTest.getMobile()));
            this.collection.add("</th>\n" +
                    "    </tr>\n" +
                    "    <tr>\n" +
                    "        <th align=\"right\"> e-mail:</th><th align=\"left\">");
            this.collection.add(String.valueOf(infoForResumeTest.getEmail()));
            this.collection.add("</th>\n" +
                    "    </tr>\n" +
                    "    <tr>\n" +
                    "        <th align=\"right\">Skype:</th><th align=\"left\">");
            this.collection.add(String.valueOf(infoForResumeTest.getSkype()));
            this.collection.add("</th>\n" +
                    "    </tr>\n" +
                    "</table>\n" +
                    "<h2>Цель:</h2>\n" +
                    "<p>");
            this.collection.add(String.valueOf(infoForResumeTest.getTarget()));
            this.collection.add("<h2>Опыт работы:</h2>\n" +
                    "<p>");
            this.collection.add(String.valueOf(infoForResumeTest.getExperience()));
            this.collection.add("</p>\n" +
                    "<h2>Образование:</h2>\n" +
                    "<p>");
            this.collection.add(String.valueOf(infoForResumeTest.getEducation()));
            this.collection.add("</p>\n" +
                    "<h2>Доп. образование и курсы:</h2>\n" +
                    "<p>");
            this.collection.add(String.valueOf(infoForResumeTest.getCourses()));
            this.collection.add("</p>\n" +
                    "<h2>Навыки:</h2>\n" +
                    "<p>");
            this.collection.add(String.valueOf(infoForResumeTest.getSkills()));
            this.collection.add("</p>\n" +
                    "<h2>Пример кода:</h2>\n" +
                    "<p>");
            this.collection.add(String.valueOf(infoForResumeTest.getExemplecode()));
            this.collection.add("</p>\n" +
                    "</body></html>");

            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("resumeForSimbirsoftFromCollection.html"), "UTF-8"));
            for (String ob : this.collection) {

                String s = ob.toString();
                out.write(s + "\n");
                out.flush();
            }
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






