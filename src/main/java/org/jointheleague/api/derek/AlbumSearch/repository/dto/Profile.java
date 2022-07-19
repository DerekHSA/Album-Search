
package org.jointheleague.api.derek.AlbumSearch.repository.dto;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Profile {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                '}';
    }
}
