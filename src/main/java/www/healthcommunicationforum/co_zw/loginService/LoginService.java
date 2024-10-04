package www.healthcommunicationforum.co_zw.loginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.healthcommunicationforum.co_zw.LoginRepository.LoginRepository;
import www.healthcommunicationforum.co_zw.login.Login;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginrepo;

    public Login login(String email, String password) {
        Login logn = loginrepo.findByEmailAndPassword(email, password);
        return login(email, password);
    }

    public Login addloginAdmn(Login lgn) {
        return loginrepo.save(lgn);
    }
}
