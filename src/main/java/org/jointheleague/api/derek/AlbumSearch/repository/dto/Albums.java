
package org.jointheleague.api.derek.AlbumSearch.repository.dto;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Albums {

    private Integer totalCount;
    private List<Items> items = null;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Albums{" +
                "totalCount=" + totalCount +
                ", items=" + items +
                '}';
    }
}
