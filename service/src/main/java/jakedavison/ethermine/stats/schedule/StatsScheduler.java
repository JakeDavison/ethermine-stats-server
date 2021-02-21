package jakedavison.ethermine.stats.schedule;

import jakedavison.ethermine.stats.api.AveragesApi;
import jakedavison.ethermine.stats.ethermine.api.EthermineCurrentStatsResponse;
import jakedavison.ethermine.stats.repository.AveragesRepository;
import jakedavison.ethermine.stats.repository.model.JpaAverage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import static jakedavison.ethermine.stats.repository.model.JpaAverage.AverageBuilder.anAverage;

@Component
public class StatsScheduler {

    public static final String ETHERMINE_BASE_URL = "https://api.ethermine.org/";

    @Value("${wallet.id}")
    private String wallet;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AveragesApi averagesApi;

    @Autowired
    private AveragesRepository averagesRepository;

    @Scheduled(fixedRate = 1000*60*60*24)
    public void scheduleFixedRateTask() {
        String GET_CURRENT_STATS_URL = ETHERMINE_BASE_URL + "miner/" + wallet + "/currentStats";

        ResponseEntity<EthermineCurrentStatsResponse> response = restTemplate.exchange(GET_CURRENT_STATS_URL, HttpMethod.GET, generateHeaders(), EthermineCurrentStatsResponse.class);

        System.out.println("API called: " + GET_CURRENT_STATS_URL + " Response was: " + response.getStatusCode());

        if (response.getBody() != null && response.getBody().getData() != null && response.getBody().getData().getAverageHashrate() != null) {
            JpaAverage average = anAverage().withAverageHashrate(Float.parseFloat(response.getBody().getData().getAverageHashrate())).build();
            averagesApi.saveAverage(average);
            System.out.println("Average persisted! Id: " + average.getAverageHashrate());
        }
    }

    private HttpEntity generateHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.ACCEPT, "application/json");
        return new HttpEntity<>(headers);
    }
}
