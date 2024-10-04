package www.healthcommunicationforum.co_zw.LoginRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import www.healthcommunicationforum.co_zw.login.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {
    Login findByEmailAndPassword(String email, String password);
}
