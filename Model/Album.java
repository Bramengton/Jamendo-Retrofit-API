package com.tonyostudio.jammily.Model;

import java.util.List;

import io.realm.annotations.PrimaryKey;

/**
 * Created by tonyofrancis on 8/19/16.
 */

public class Album {

    @PrimaryKey
    private int id;
    private String name;
    private String releasedate;
    private int artist_id;
    private String artist_name;
    private String image;
    private String zip;
    private String shorturl;
    private String shareurl;
    private List<Track> tracks;
    private MusicInfo musicinfo;

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

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getShorturl() {
        return shorturl;
    }

    public void setShorturl(String shorturl) {
        this.shorturl = shorturl;
    }

    public String getShareurl() {
        return shareurl;
    }

    public void setShareurl(String shareurl) {
        this.shareurl = shareurl;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public MusicInfo getMusicinfo() {
        return musicinfo;
    }

    public void setMusicinfo(MusicInfo musicinfo) {
        this.musicinfo = musicinfo;
    }
}
