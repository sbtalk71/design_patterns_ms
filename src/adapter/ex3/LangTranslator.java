package adapter.ex3;

public class LangTranslator {
    Spanish spanish = new Spanish();

    public void greet(String message) {
        //traslation login goes here
        spanish.greet("Buenos días");
    }

}
