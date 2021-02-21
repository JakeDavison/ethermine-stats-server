package jakedavison.ethermine.stats;

import jakedavison.ethermine.stats.repository.AveragesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EthermineStatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EthermineStatsApplication.class, args);
	}

}
