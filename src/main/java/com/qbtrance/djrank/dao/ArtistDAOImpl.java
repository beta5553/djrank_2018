package com.qbtrance.djrank.dao;

import com.qbtrance.djrank.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ArtistDAOImpl implements ArtistDAO {

    @Autowired
    private DataSource dataSource;
    Connection conn;

    @Override
    public void insertArtist() throws SQLException {

        Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from artist where id = ?");

        Artist artist = null;
        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("name"));
        }

        rs.close();
        ps.close();
    }

    @Override
    public Artist selectArtist() throws SQLException {

        System.out.println("ArtistDaoImpl.selectArtist()");
        Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from artist");

        Artist artist = null;
        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("name"));
        }

        rs.close();
        ps.close();
        return null;
    }

    @Override
    public List<Artist> selectAllArtists() throws SQLException {
        Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from artist where id = ?");

        Artist artist = null;
        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("name"));
        }

        rs.close();
        ps.close();
        return null;
    }

        @Override
        public void deleteArtist() throws SQLException {
            Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement("select * from artist where id = ?");

            Artist artist = null;
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
            }

            rs.close();
            ps.close();
    }

    // Using JDBCTemplate
    public int getArtistCount()
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        String sql = "SELECT * FROM ARTIST";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }
}