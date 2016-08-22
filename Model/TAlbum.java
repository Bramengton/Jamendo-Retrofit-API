package com.tonyostudio.jammily.Model;

import java.util.List;

/**
 * Created by tonyofrancis on 8/19/16.
 */

public class TAlbum {

    private THeader headers;
    private List<Album> results;

    public THeader getHeaders() {
        return headers;
    }

    public void setHeaders(THeader headers) {
        this.headers = headers;
    }

    public List<Album> getResults() {
        return results;
    }

    public void setResults(List<Album> results) {
        this.results = results;
    }
}
