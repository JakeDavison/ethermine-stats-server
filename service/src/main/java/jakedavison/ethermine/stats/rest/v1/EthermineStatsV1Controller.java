package jakedavison.ethermine.stats.rest.v1;

import jakedavison.ethermine.stats.api.AveragesApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static jakedavison.ethermine.stats.rest.v1.AveragesResponse.AveragesResponseBuilder.anAveragesResponse;

@Controller
public class EthermineStatsV1Controller {

    @Autowired
    private AveragesApi averagesApi;

    @GetMapping(value = "/averages/lifetime", produces = "application/json")
    public @ResponseBody AveragesResponse getLifetimeAverage() {
        return anAveragesResponse()
                .withLifetimeAverage(averagesApi.getLifetimeAverage())
                .build();
    }
}
