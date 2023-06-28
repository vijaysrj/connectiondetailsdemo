package com.connection.details.connectiondemo;

import org.springframework.boot.autoconfigure.jdbc.JdbcConnectionDetails;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConnectionDetails implements JdbcConnectionDetails {

    @Override
    public String getDriverClassName() {
        return "org.h2.Driver";
    }

    @Override
    public String getJdbcUrl() {
        return "jdbc:h2:mem:testdb";

    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return "sa";
    }

}
