package br.com.ricas.application.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoviesResponse {

    private String title;

    public String getTitle() {
        return title;
    }
}