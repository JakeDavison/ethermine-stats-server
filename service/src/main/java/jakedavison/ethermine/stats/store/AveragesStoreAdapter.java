package jakedavison.ethermine.stats.store;

import jakedavison.ethermine.stats.api.model.Average;
import jakedavison.ethermine.stats.repository.AveragesRepository;
import jakedavison.ethermine.stats.repository.model.JpaAverage;
import jakedavison.ethermine.stats.spi.AveragesStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.PersistenceException;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Component
public class AveragesStoreAdapter implements AveragesStore {

    @Autowired
    private AveragesRepository averagesRepository;

    @Override
    public List<Float> getAllAverages() {
        return averagesRepository.findAll().stream().map(JpaAverage::getAverageHashrate).collect(toList());
    }

    @Override
    public void storeAverage(Average average) {
        if (average instanceof JpaAverage) {
            averagesRepository.save((JpaAverage) average);
        } else {
            throw new PersistenceException("Couldn't persist average. Object was not instance of JpaAverage.");
        }
    }
}
