package proxy.ex2;

import proxy.Gateway;

import java.sql.SQLOutput;

public class GWProxy extends Gateway {
    @Override
    public String getInternetConnection() {
        System.out.println("authentication");
        System.out.println("Authrization");
        return super.getInternetConnection();
    }
}
