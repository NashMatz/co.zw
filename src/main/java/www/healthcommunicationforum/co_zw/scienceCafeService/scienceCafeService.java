package www.healthcommunicationforum.co_zw.scienceCafeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.healthcommunicationforum.co_zw.scienceCafe.scienceCafe;
import www.healthcommunicationforum.co_zw.scienceCafeRepository.scienceCafeRepository;

import java.util.List;
import java.util.Optional;


public interface scienceCafeService{

  static List<scienceCafe> getscienceCafeList(){
      return getscienceCafeList();
  }
    void savescienceCafe(scienceCafe sciencecafe);

   // Optional<scienceCafe> getscienceCafebyId(Long id);

    }

