package atm.cortex.designer.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Campaign {

    @JsonProperty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
