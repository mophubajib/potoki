package com.simbirsoft.java;

import java.io.IOException;

public class TestMain {

    public static void main(String[] args) throws Exception {

        Controller controller = new Controller();



        controller.execute();

    }
}

class Controller {
//    PropsReader modelLayer = new PropsReaderImpl();
    View view = new HtmlView();
    View view1 =new HtmlOfArraylist();

    InfoForResumeTest infoForResumeTest;
    PropsReaderImpl propsReader = new PropsReaderImpl();
//PropsReaderImpl propsReaderImpl = new PropsReaderImpl();
    Thread thread = new PropsReaderImpl();
//        new Thread(new PropsReaderImpl());


//    thread.start();




    void execute() throws InterruptedException {

        thread.start();





        InfoForResumeTest infoForResumeTest = propsReader.getInfoForResume();

        System.out.println(infoForResumeTest.getDob());


//        InfoForResumeTest infoForResumeTest = propsReader.getInfoForResumeTest();

//        InfoForResumeTest infoForResumeTest1 = new PropsReaderImpl();

//        InfoForResumeTest infoForResumeTest = modelLayer.run();

        view.createHtml(infoForResumeTest);
        view1.createHtml(infoForResumeTest);
        System.out.println(infoForResumeTest.getDob());


//        view.createHtml();
//        view1.createHtml();

    }

}


