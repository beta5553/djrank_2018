package com.qbtrance.djrank.dao;

import com.qbtrance.djrank.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.*;

public class JDBCSpringApplicationContext {

    public static void main (String [] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        JDBCSpringApplicationContext dbclass = new JDBCSpringApplicationContext();

        try {
            dbclass.getArtist();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("User not found"  + e.getMessage());
        }
    }

    public Artist getArtist() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        DataSource dataSource = ctx.getBean("dataSource", DataSource.class);
        Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from DJ");
        //ps.setInt(1, id);

        Artist artist = null;
        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("fname"));
        }

        rs.close();
        ps.close();
        return artist;
    }
}
