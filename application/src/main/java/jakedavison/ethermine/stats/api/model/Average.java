package jakedavison.ethermine.stats.api.model;

import java.time.OffsetDateTime;

public abstract class Average {

    private Long id;
    private OffsetDateTime date;
    private Float averageHashrate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public Float getAverageHashrate() {
        return averageHashrate;
    }

    public void setAverageHashrate(Float averageHashrate) {
        this.averageHashrate = averageHashrate;
    }
}
