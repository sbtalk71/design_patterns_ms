package interpreter.ex2;

import java.util.StringTokenizer;

class Parser {
    private String expression;
    private String result;
    StringTokenizer st;
    private String interpreted;


    public Parser(String e) {
        expression = e;

    }

    public void myParser() {
        st = new StringTokenizer(expression, " ");
    }

    public void interpret() {

        StringBuffer buffer = new StringBuffer();

        while (st.hasMoreTokens()) {
            String token = (String) st.nextToken();
            if (token.equals("SFO")) {
                token = "San Francisco";
            } else if (token.equals("CA")) {
                token = "Canada";
            } else if (token.equals("IND")) {
                token = "India";
            }


            buffer.append(" " + token);
        }
        interpreted = buffer.toString();
    }

    public String toString() {
        return interpreted;
    }

}

class InterpreterExample {
    public static void main(String[] args) {
        String source = " I started from SFO and went to CA and then to IND";

        Parser parser = new Parser(source);
        parser.myParser();
        parser.interpret();

        System.out.println("Output is :"+ parser);
    }
}
//
