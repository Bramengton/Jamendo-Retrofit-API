package com.tonyostudio.jammily.Model;

import java.util.List;

/**
 * Created by tonyofrancis on 8/20/16.
 */

public class TReview {

    private THeader headers;
    private List<Review> results;

    public THeader getHeaders() {
        return headers;
    }

    public void setHeaders(THeader headers) {
        this.headers = headers;
    }

    public List<Review> getResults() {
        return results;
    }

    public void setResults(List<Review> results) {
        this.results = results;
    }
}
