package jakedavison.ethermine.stats.repository.model;

import jakedavison.ethermine.stats.api.model.Average;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Entity
@Table(name = "AVERAGE_HASHRATES")
public class JpaAverage extends Average {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date")
    private OffsetDateTime date;

    @Column(name = "hashrate")
    private Float averageHashrate;

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


    public static final class AverageBuilder {
        private Float averageHashrate;

        private AverageBuilder() {
        }

        public static AverageBuilder anAverage() {
            return new AverageBuilder();
        }

        public AverageBuilder withAverageHashrate(Float averageHashrate) {
            this.averageHashrate = averageHashrate;
            return this;
        }

        public JpaAverage build() {
            JpaAverage average = new JpaAverage();
            average.setDate(OffsetDateTime.now(ZoneOffset.UTC));
            average.setAverageHashrate(averageHashrate);
            return average;
        }
    }
}
