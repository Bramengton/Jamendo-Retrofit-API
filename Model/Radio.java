package com.tonyostudio.jammily.Model;

/**
 * Created by tonyofrancis on 8/20/16.
 */

public class Radio {

    private int id;
    private String name;
    private String dispname;
    private String type;
    private String image;
    private String stream;
    private PlayingNow playingnow;
    private String callmeback;

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

    public String getDispname() {
        return dispname;
    }

    public void setDispname(String dispname) {
        this.dispname = dispname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public PlayingNow getPlayingnow() {
        return playingnow;
    }

    public void setPlayingnow(PlayingNow playingnow) {
        this.playingnow = playingnow;
    }

    public String getCallmeback() {
        return callmeback;
    }

    public void setCallmeback(String callmeback) {
        this.callmeback = callmeback;
    }
}
