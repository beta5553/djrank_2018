package com.qbtrance.djrank.dao;

import com.qbtrance.djrank.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;

@Repository
public class JDBCSpringApplicationContext {

    @Autowired
    private DataSource dataSource;
    Connection conn;

  /*  public static void main (String [] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException
    {
        System.out.println("in JDBCSpringApplicationContext.main");
        JDBCSpringApplicationContext dbclass = new JDBCSpringApplicationContext();

        try {
            dbclass.getArtists();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("User not found"  + e.getMessage());
        }
    }*/

    public void getArtists() throws SQLException {

        System.out.println("in JDBCSpringApplicationContext.getArtists");

        conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from DJ");
        System.out.println("in JDBCSpringApplicationContext.getArtists, after db operations 1");

        Artist artist = null;
        ResultSet rs = ps.executeQuery();
        System.out.println("in JDBCSpringApplicationContext.getArtists, after db operations 2");

        if(rs.next()) {
            System.out.println(rs.getInt("fname"));
            System.out.println(rs.getString("lname"));
        }

        rs.close();
        ps.close();

        System.out.println("in JDBCSpringApplicationContext.getArtists, after db operations 3");

    }
}
