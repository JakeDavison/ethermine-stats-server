package jakedavison.ethermine.stats.rest.v1;

public class AveragesResponse {

    private String lifetimeAverage;

    public String getLifetimeAverage() {
        return lifetimeAverage;
    }

    public void setLifetimeAverage(String lifetimeAverage) {
        this.lifetimeAverage = lifetimeAverage;
    }


    public static final class AveragesResponseBuilder {
        private String lifetimeAverage;

        private AveragesResponseBuilder() {
        }

        public static AveragesResponseBuilder anAveragesResponse() {
            return new AveragesResponseBuilder();
        }

        public AveragesResponseBuilder withLifetimeAverage(String lifetimeAverage) {
            this.lifetimeAverage = lifetimeAverage;
            return this;
        }

        public AveragesResponse build() {
            AveragesResponse averagesResponse = new AveragesResponse();
            averagesResponse.setLifetimeAverage(lifetimeAverage);
            return averagesResponse;
        }
    }
}
