package www.healthcommunicationforum.co_zw.healthStoriesRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.healthcommunicationforum.co_zw.healthStories.healthStories;

import java.util.List;
@Repository
public interface healthStoriesRepository extends JpaRepository<healthStories, String> {
    List<healthStories> findAll();
    <S extends healthStories> S save(S healthStories);
}


