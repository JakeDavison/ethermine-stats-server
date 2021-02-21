package jakedavison.ethermine.stats.repository;

import jakedavison.ethermine.stats.repository.model.JpaAverage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AveragesRepository extends JpaRepository<JpaAverage, Long> {
}
