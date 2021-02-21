package jakedavison.ethermine.stats.app;

import jakedavison.ethermine.stats.api.AveragesApi;
import jakedavison.ethermine.stats.api.model.Average;
import jakedavison.ethermine.stats.spi.AveragesStore;

import java.util.List;

public class AveragesApplication implements AveragesApi {

    private AveragesStore averagesStore;

    public AveragesApplication(AveragesStore averagesStore) {
        this.averagesStore = averagesStore;
    }

    @Override
    public String getLifetimeAverage() {
        List<Float> allAverages = averagesStore.getAllAverages();
        float avg = allAverages.stream().reduce(0f, Float::sum) / allAverages.size();
        return String.valueOf(avg);
    }

    @Override
    public void saveAverage(Average average) {
        averagesStore.storeAverage(average);
    }
}
