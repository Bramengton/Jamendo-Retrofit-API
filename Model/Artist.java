package com.tonyostudio.jammily.Model;

import java.util.List;

import io.realm.annotations.PrimaryKey;

/**
 * Created by tonyofrancis on 8/20/16.
 */

public class Artist {

    @PrimaryKey
    private int id;
    private String name;
    private String website;
    private String joindate;
    private String image;
    private String shorturl;
    private String shareurl;
    private List<Track> tracks;
    private List<Album> albums;
    private List<Location> locations;
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

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getJoindate() {
        return joindate;
    }

    public void setJoindate(String joindate) {
        this.joindate = joindate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public MusicInfo getMusicinfo() {
        return musicinfo;
    }

    public void setMusicinfo(MusicInfo musicinfo) {
        this.musicinfo = musicinfo;
    }
}
