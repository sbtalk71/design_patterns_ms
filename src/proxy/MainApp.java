package proxy;

import proxy.ex2.GWProxy;

public class MainApp {
    public static void main(String[] args) {
        Gateway gw = new GWProxy();
        String internet=gw.getInternetConnection();
    }
}
