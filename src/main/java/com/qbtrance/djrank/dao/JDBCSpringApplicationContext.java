package com.qbtrance.djrank.dao;

import com.qbtrance.djrank.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.*;

public class JDBCSpringApplicationContext {

    @Autowired
    private DataSource dataSource;
    Connection conn;

    public static void main (String [] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        JDBCDerbyDaoImpl dbclass = new JDBCDerbyDaoImpl();

        try {
            dbclass.getArtist(2);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("User not found"  + e.getMessage());
        }
    }

    public Artist getArtist(int id) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from artist where id = ?");
        ps.setInt(1, id);

        Artist artist = null;
        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("name"));
        }

        rs.close();
        ps.close();
        return artist;
    }
}
