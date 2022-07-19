
package org.jointheleague.api.derek.AlbumSearch.repository.dto;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Artists {

    private List<Items> items = null;

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Artists{" +
                "items=" + items +
                '}';
    }
}
