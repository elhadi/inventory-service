package atm.cortex.designer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;


public class Campaign {

    @JsonProperty
    private String name;

    private Date creationDate;

    private Date startDate;

    private Date endDate;

    private String description;

    private Status status;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status_campaign1) {
        this.status = status_campaign1;
    }

    /**
     * Checks if the campaign has expired
     * @param campaign
     * @return
     */
    public boolean isExpired() {
       return this.getEndDate().toInstant().isBefore(Instant.now());
    }
}
