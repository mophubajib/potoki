package com.simbirsoft.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) throws IOException {

        Controller controller = new Controller();
        controller.execute();
    }
}

class Controller {
    PropsReader modelLayer = new PropsReaderImpl();
    View view = new HtmlView();
    View view1 =new HtmlOfArraylist();

    void execute() {
        InfoForResumeTest infoForResumeTest = modelLayer.getInfoForResume();
        view.createHtml(infoForResumeTest);
        view1.createHtml(infoForResumeTest);
    }

}


