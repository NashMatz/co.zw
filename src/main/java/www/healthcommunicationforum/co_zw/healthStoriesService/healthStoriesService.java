package www.healthcommunicationforum.co_zw.healthStoriesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import www.healthcommunicationforum.co_zw.healthStories.healthStories;
import www.healthcommunicationforum.co_zw.healthStoriesRepository.healthStoriesRepository;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
@Service
public class healthStoriesService {
   @Autowired
   healthStoriesRepository healthstoriesrepository;
   public List<healthStories> gethealthStoriesList() {
       return healthstoriesrepository.findAll();
   }

  public healthStories savehealthstories(healthStories healthstories) {
        return healthstoriesrepository.save(healthstories);
    }

    public void saveHealthStories(String heading_of_story, String the_story, byte[] image, String datetime){

       healthStories hs = new healthStories();

       hs.setHeading_of_story(hs.getHeading_of_story());
       hs.setThe_story(hs.getThe_story());
       hs.setImage(hs.getImage());
       /*
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        if (fileName.contains("")){
            System.out.println("not a valid file");
        }
        try {
            hs.setImage((Base64.getEncoder().encodeToString(file.getBytes())));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
       hs.setDatetime(hs.getDatetime());

       healthstoriesrepository.save(hs);

    }
}
