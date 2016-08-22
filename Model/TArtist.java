package com.tonyostudio.jammily.Model;

import java.util.List;

/**
 * Created by tonyofrancis on 8/20/16.
 */

public class TArtist {

    private THeader headers;
    private List<Artist> results;

    public THeader getHeaders() {
        return headers;
    }

    public void setHeaders(THeader headers) {
        this.headers = headers;
    }

    public List<Artist> getResults() {
        return results;
    }

    public void setResults(List<Artist> results) {
        this.results = results;
    }
}
