package www.healthcommunicationforum.co_zw.scienceCafeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.healthcommunicationforum.co_zw.scienceCafe.scienceCafe;
import www.healthcommunicationforum.co_zw.scienceCafeRepository.scienceCafeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class scienceCafeServiceImpl implements scienceCafeService {


    @Autowired
    private scienceCafeRepository sciencecaferepository;


    /**
     * @return
     */
   // @Override
    public List<scienceCafe> getscienceCafeList() {
        return sciencecaferepository.findAll();
    }

    /**
     * @param sciencecafe
     */
    @Override
    public void savescienceCafe(scienceCafe sciencecafe) {
        this.sciencecaferepository.save(sciencecafe);
    }

    /**
     * @param id
     * @return
     */
    /*
    @Override
    public Optional<scienceCafe> getscienceCafebyId(Long id) {
        return sciencecaferepository.findById(id);
    }*/
}
