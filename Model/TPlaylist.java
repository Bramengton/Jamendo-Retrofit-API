package com.tonyostudio.jammily.Model;

import java.util.List;

/**
 * Created by tonyofrancis on 8/20/16.
 */

public class TPlaylist {

    private THeader headers;
    private List<Playlist> results;

    public THeader getHeaders() {
        return headers;
    }

    public void setHeaders(THeader headers) {
        this.headers = headers;
    }

    public List<Playlist> getResults() {
        return results;
    }

    public void setResults(List<Playlist> results) {
        this.results = results;
    }
}
