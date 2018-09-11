package com.qbtrance.djrank.dao;

import com.qbtrance.djrank.model.Artist;

import java.sql.SQLException;
import java.util.List;

public interface ArtistDAO {

    void insertArtist() throws SQLException;

    Artist selectArtist() throws SQLException;

    List<Artist> selectAllArtists() throws SQLException;

    void deleteArtist() throws SQLException;

}
