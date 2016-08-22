package com.tonyostudio.jammily.Model;

import java.util.List;

/**
 * Created by tonyofrancis on 8/20/16.
 */

public class TRadio {

    private THeader headers;
    private List<Radio> results;

    public THeader getHeaders() {
        return headers;
    }

    public void setHeaders(THeader headers) {
        this.headers = headers;
    }

    public List<Radio> getResults() {
        return results;
    }

    public void setResults(List<Radio> results) {
        this.results = results;
    }
}
