package org.jointheleague.api.derek.AlbumSearch.repository.dto;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Result {
    private String query;
    private Albums albums;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Albums getAlbums() {
        return albums;
    }

    public void setAlbums(Albums albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "Result{" +
                "query='" + query + '\'' +
                ", albums=" + albums +
                '}';
    }
}