package com.demo.factory;

public class OracleDB implements MyConnection{
    @Override
    public String getConnectionInfo() {
        return "Oracle Connection";
    }

    @Override
    public String getDBVersion() {
        return "Oracle 19c";
    }
}
