package adapter.ex4;

import adapter.ex3.English;

public class LangTranslator {
    Spanish spanish = new Spanish();


    public void greet(String message) {
        //traslation login goes here
        spanish.greet("Buenos días");
    }

}
