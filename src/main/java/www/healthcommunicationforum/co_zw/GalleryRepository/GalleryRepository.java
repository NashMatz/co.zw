package www.healthcommunicationforum.co_zw.GalleryRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.healthcommunicationforum.co_zw.Gallery.Gallery;

import java.util.List;

@Repository
public interface GalleryRepository extends JpaRepository<Gallery, Long> {
    @Override
    List<Gallery> findAll();

    @Override
    <S extends Gallery> S save(S Gallery);
}
