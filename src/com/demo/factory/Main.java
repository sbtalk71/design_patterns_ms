package com.demo.factory;

public class Main {
    public static void main(String[] args) {
        MyConnection conn=DBConnectionFactory.getDbInstance("oracle");
        System.out.println(conn.getConnectionInfo());
        System.out.println(conn.getDBVersion());

    }
}
