package com.simbirsoft.java;
import java.io.IOException;

public class TestMain {

    public static void main(String[] args)  throws IOException {

        Controller controller = new Controller();
        controller.execute();
    }
}

class Controller{
            ModelLayer modelLayer = new PropertiesLayer();
            View view = new HtmlView();
            void execute() {
                InfoForResumeTest infoForResumeTest = modelLayer.getInfoForResume();
                view.CreateHtml(infoForResumeTest);

            }
}


