
package org.jointheleague.api.derek.AlbumSearch.repository.dto;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Items {

    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Items{" +
                "data=" + data +
                '}';
    }
}
