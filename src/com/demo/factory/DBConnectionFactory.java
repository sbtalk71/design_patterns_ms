package com.demo.factory;

public class DBConnectionFactory {
    public static MyConnection getDbInstance(String dbType) {
        if (dbType.equals("mysql")) {
            return new MySqlDB();
        } else if (dbType.equals("oracle")) {
            return new OracleDB();
        } else {
            throw new RuntimeException("DB Not Supported");
        }

        //Class.forName(com.demo.OracleDB).newInstance();
    }
}
