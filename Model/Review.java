package com.tonyostudio.jammily.Model;

import io.realm.annotations.PrimaryKey;

/**
 * Created by tonyofrancis on 8/20/16.
 */

public class Review {

    @PrimaryKey
    private String id;
    private String title;
    private String text;
    private String dateadded;
    private String agreecnt;
    private String lang;
    private String user_id;
    private String user_name;
    private String user_dispname;
    private String score;
    private String album_id;
    private String album_name;
    private String artist_id;
    private String track_id;
    private String track_name;
    private String track_license_ccurl;
    private String track_audio;
    private String track_audiodownload;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDateadded() {
        return dateadded;
    }

    public void setDateadded(String dateadded) {
        this.dateadded = dateadded;
    }

    public String getAgreecnt() {
        return agreecnt;
    }

    public void setAgreecnt(String agreecnt) {
        this.agreecnt = agreecnt;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_dispname() {
        return user_dispname;
    }

    public void setUser_dispname(String user_dispname) {
        this.user_dispname = user_dispname;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(String album_id) {
        this.album_id = album_id;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(String artist_id) {
        this.artist_id = artist_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getTrack_id() {
        return track_id;
    }

    public void setTrack_id(String track_id) {
        this.track_id = track_id;
    }

    public String getTrack_name() {
        return track_name;
    }

    public void setTrack_name(String track_name) {
        this.track_name = track_name;
    }

    public String getTrack_license_ccurl() {
        return track_license_ccurl;
    }

    public void setTrack_license_ccurl(String track_license_ccurl) {
        this.track_license_ccurl = track_license_ccurl;
    }

    public String getTrack_audio() {
        return track_audio;
    }

    public void setTrack_audio(String track_audio) {
        this.track_audio = track_audio;
    }

    public String getTrack_audiodownload() {
        return track_audiodownload;
    }

    public void setTrack_audiodownload(String track_audiodownload) {
        this.track_audiodownload = track_audiodownload;
    }
}
