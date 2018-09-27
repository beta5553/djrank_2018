package com.qbtrance.djrank.dao;

import com.qbtrance.djrank.model.Artist;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class JDBCDerbyDaoImpl {

    /**
     *
     * @param args
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws ClassNotFoundException
     */
    public static void main (String [] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        JDBCDerbyDaoImpl dbclass = new JDBCDerbyDaoImpl();

        try {
            dbclass.getArtist();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("User not found"  + e.getMessage());
        }
    }

    /**
     * .
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public void getArtist() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        Connection conn = null;
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/db_djrank");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM ARTIST");
        //ps.setInt(1, id);
        //Artist artist = null;
        ResultSet rs = ps.executeQuery();

        System.out.println("JDBCDerbyDoaImpl.getArtist");
        if(rs.next()) {
            System.out.println(rs.getInt("name"));
            System.out.println(rs.getString("artist_name"));
        }

        rs.close();
        ps.close();
    }
}