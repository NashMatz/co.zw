package www.healthcommunicationforum.co_zw.GalleryController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import www.healthcommunicationforum.co_zw.Gallery.Gallery;
import www.healthcommunicationforum.co_zw.GalleryService.GalleryService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GalleryController {
    @Autowired
    private GalleryService galleryService;

    @GetMapping("/listgallery")
    public List<Gallery> getGalleryList(){
        return galleryService.getGalleryList();
    }

   @PostMapping("/addGallery")
    public String saveGallery(@Valid @RequestBody Gallery gallery){

        Gallery gs = new Gallery();
        gs.setImage("image");
        gs.setName_of_event("name_of_event");
        galleryService.saveGallery(gallery);
        return "redirect:/add";
    }
}
