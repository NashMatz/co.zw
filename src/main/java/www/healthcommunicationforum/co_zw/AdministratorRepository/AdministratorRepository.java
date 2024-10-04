package www.healthcommunicationforum.co_zw.AdministratorRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.healthcommunicationforum.co_zw.Administrator.Administrator;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
    @Override
    <S extends Administrator> S save(S Administrator);
}
