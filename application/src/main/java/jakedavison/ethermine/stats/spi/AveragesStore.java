package jakedavison.ethermine.stats.spi;

import jakedavison.ethermine.stats.api.model.Average;

import java.util.List;

public interface AveragesStore {

    List<Float> getAllAverages();

    void storeAverage(Average average);

}
