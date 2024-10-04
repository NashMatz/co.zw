package www.healthcommunicationforum.co_zw.GalleryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.healthcommunicationforum.co_zw.Gallery.Gallery;
import www.healthcommunicationforum.co_zw.GalleryRepository.GalleryRepository;
import www.healthcommunicationforum.co_zw.healthStories.healthStories;
import www.healthcommunicationforum.co_zw.healthStoriesRepository.healthStoriesRepository;

import java.util.List;

@Service
public class GalleryService {

    @Autowired
    GalleryRepository galleryRepository;

    public Gallery saveGallery(Gallery gallery){

        return galleryRepository.save(gallery);
    }
    public List<Gallery> getGalleryList() {

        return galleryRepository.findAll();
    }

}
