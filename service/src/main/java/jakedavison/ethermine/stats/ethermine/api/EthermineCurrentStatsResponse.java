package jakedavison.ethermine.stats.ethermine.api;

public class EthermineCurrentStatsResponse {

    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data {

        private String averageHashrate;

        public String getAverageHashrate() {
            return averageHashrate;
        }

        public void setAverageHashrate(String averageHashrate) {
            this.averageHashrate = averageHashrate;
        }
    }
}
