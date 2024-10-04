package www.healthcommunicationforum.co_zw.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.healthcommunicationforum.co_zw.AdministratorRepository.AdministratorRepository;

@Service
public class AdministratorServiceImpl extends AdministratorService {
    @Autowired
    private AdministratorRepository administratorRepository;

    public AdministratorServiceImpl(AdministratorRepository administratorRepository){
        super();
        this.administratorRepository = administratorRepository;
    }
}
