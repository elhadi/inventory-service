package atm.cortex.designer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Calendar;
import java.util.Date;


public class Campaign {

    @JsonProperty
    private String name;

    private Date creation_date;

    private Date start_date;

    private Date end_date;

    private String description;

    private Status status_campaign;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus_campaign() {
        return status_campaign;
    }

    public void setStatus_campaign(Status status_campaign1) {
        this.status_campaign = status_campaign1;
    }

    public boolean dateStatusExpired(Campaign campaign) {
       boolean check=false;
        if(campaign.getEnd_date().equals(new Date())== true){
        setStatus_campaign(Status.EXPIRED);
        return check=true;}
        return check;
    }
}
