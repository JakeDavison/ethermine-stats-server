package jakedavison.ethermine.stats.rest.v1;

import jakedavison.ethermine.stats.api.AveragesApi;
import jakedavison.ethermine.stats.app.AveragesApplication;
import jakedavison.ethermine.stats.spi.AveragesStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfiguration {

    @Bean
    public AveragesApi averagesApi(AveragesStore averagesStore) {
        return new AveragesApplication(averagesStore);
    }

}
