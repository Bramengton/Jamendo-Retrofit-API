package com.tonyostudio.jammily.Model;

/**
 * Created by tonyofrancis on 8/19/16.
 */

public class THeader {
    private String status;
    private int code;
    private String error_message;
    private String warnings;
    private int results_count;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    public int getResults_count() {
        return results_count;
    }

    public void setResults_count(int results_count) {
        this.results_count = results_count;
    }
}
