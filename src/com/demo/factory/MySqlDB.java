package com.demo.factory;

public class MySqlDB implements MyConnection{
    @Override
    public String getConnectionInfo() {
        return "MySQL Connection";
    }

    @Override
    public String getDBVersion() {
        return "MySQL 7.57";
    }
}
