package com.qbtrance.djrank.model;

import java.util.List;

public class Artist {

    private int id;
    private String name;
    private String artistName; //AKA?/ Also Know As.
    private String DOB; //Date of birth.
    private String POB; //Place of birth.
    private String arstistSince; //When did the artist started making art.
    private List<String> majorInfluences;
    private List<String> eventsPerformed; // A list of events where the artists have had performed.
    private String soundCloud;
    private String mixCloud;

    public Artist(int id, String name, String artistName, String DOB, String POB, String arstistSince, List<String> majorInfluences, List<String> eventsPerformed, String soundCloud, String mixCloud) {
        this.id = id;
        this.name = name;
        this.artistName = artistName;
        this.DOB = DOB;
        this.POB = POB;
        this.arstistSince = arstistSince;
        this.majorInfluences = majorInfluences;
        this.eventsPerformed = eventsPerformed;
        this.soundCloud = soundCloud;
        this.mixCloud = mixCloud;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPOB() {
        return POB;
    }

    public void setPOB(String POB) {
        this.POB = POB;
    }

    public String getArstistSince() {
        return arstistSince;
    }

    public void setArstistSince(String arstistSince) {
        this.arstistSince = arstistSince;
    }

    public List<String> getMajorInfluences() {
        return majorInfluences;
    }

    public void setMajorInfluences(List<String> majorInfluences) {
        this.majorInfluences = majorInfluences;
    }

    public List<String> getEventsPerformed() {
        return eventsPerformed;
    }

    public void setEventsPerformed(List<String> eventsPerformed) {
        this.eventsPerformed = eventsPerformed;
    }

    public String getSoundCloud() {
        return soundCloud;
    }

    public void setSoundCloud(String soundCloud) {
        this.soundCloud = soundCloud;
    }

    public String getMixCloud() {
        return mixCloud;
    }

    public void setMixCloud(String mixCloud) {
        this.mixCloud = mixCloud;
    }

}
