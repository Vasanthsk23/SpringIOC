package com.book.feedback;

import org.springframework.stereotype.Repository;

import java.io.*;
import java.sql.*;

@Repository
public class DataBaseManagement {
    public static void saveFeedBackInDB(String yourname, String bookname, String feedback) throws Exception
    {
        String url
                = "jdbc:mysql://localhost:3306/Book"; // table details
        String username = "root"; // MySQL credentials
        String password = "Vasanthsk231708@";
        Class.forName(
                "com.mysql.cj.jdbc.Driver"); // Driver name
        Connection con = DriverManager.getConnection(
                url, username, password);
        System.out.println(
                "Connection Established successfully");
        String query
                = "INSERT into FeedBack(yourname,bookname,feedback) values "; // query to be run
        query = query + "('" +yourname +"','" + bookname + "','" + feedback + "')";
        System.out.println(query);

        Statement st = con.createStatement();
        int result = st.executeUpdate(query);
        System.out.println(result + " Rows Inserted Successfully ");
        st.close(); // close statement
        con.close(); // close connection
        System.out.println("Connection Closed....");

    }
}

