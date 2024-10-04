package www.healthcommunicationforum.co_zw.AdministratorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.healthcommunicationforum.co_zw.Administrator.Administrator;
import www.healthcommunicationforum.co_zw.AdministratorRepository.AdministratorRepository;

import java.util.List;

@Service
public class AdministratorService {

    @Autowired
    AdministratorRepository administratorRepository;

    public Administrator saveAdministrator(Administrator admin){
        return administratorRepository.save(admin);
    }

    public Administrator saveorUpdateAdministrator(Administrator newadministrator) {
        Administrator administrator = new Administrator();
            if (administrator != null) {
                administrator.setEmail(newadministrator.getEmail());
                administrator.setPassword(newadministrator.getPassword());
                return administratorRepository.save(administrator);
            }
        return administratorRepository.save(administrator);
    }
    public List<Administrator> adminlist() {
        return administratorRepository.findAll();
    }
}
