
package org.jointheleague.api.derek.CrimeSearch.repository.dto;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class PagingInfo {

    private Object nextOffset;
    private Integer limit;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getNextOffset() {
        return nextOffset;
    }

    public void setNextOffset(Object nextOffset) {
        this.nextOffset = nextOffset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
