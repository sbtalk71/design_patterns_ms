package adapter.ex3;

public class English {
    LangTranslator translator=new LangTranslator();
    public void greet(String message){
        translator.greet(message);
    }
}
