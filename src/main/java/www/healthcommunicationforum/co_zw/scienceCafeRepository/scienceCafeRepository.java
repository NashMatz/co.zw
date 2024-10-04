package www.healthcommunicationforum.co_zw.scienceCafeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.healthcommunicationforum.co_zw.healthStories.healthStories;
import www.healthcommunicationforum.co_zw.scienceCafe.scienceCafe;

import java.util.List;

@Repository
public interface scienceCafeRepository extends JpaRepository<scienceCafe, Long> {
   
}
