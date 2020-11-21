package com.sc.spring;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 类名：Test
 * 描述：一段话描述类的信息
 * 作者：林宇辉fuygfhj
 * 日期：2020/11/13 20:35
 * 版本：V1.0
 */
public class Test {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String driver ="oracle.jdbc.driver.OracleDriver";
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="scott";
        String password="scott";

        Class.forName(driver);
        System.out.println("注册成功");
        Connection connection= DriverManager.getConnection(url,username,password);

    }
}
