package com.tonyostudio.jammily.Model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by tonyofrancis on 8/20/16.
 */

public class Track extends RealmObject {

    @PrimaryKey
    private int id;
    private String name;
    private int duration;
    private int artist_id;
    private String artist_name;
    private String artist_idstr;
    private String album_name;
    private int album_id;
    private String license_ccurl;
    private int position;
    private String releasedate;
    private String album_image;
    private String audio;
    private String audiodownload;
    private String prourl;
    private String shorturl;
    private String shareurl;
    private String image;
}
