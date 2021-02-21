package jakedavison.ethermine.stats;

import jakedavison.ethermine.stats.repository.AveragesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class EthermineStatsApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Ethermine Stats Server";
	}

	public static void main(String[] args) {
		SpringApplication.run(EthermineStatsApplication.class, args);
	}

}
