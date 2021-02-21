package jakedavison.ethermine.stats.api;

import jakedavison.ethermine.stats.api.model.Average;

public interface AveragesApi {

     String getLifetimeAverage();

     void saveAverage(Average average);

}
