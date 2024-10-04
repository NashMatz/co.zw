package www.healthcommunicationforum.co_zw.healthtimesController;

import antlr.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import www.healthcommunicationforum.co_zw.Administrator.Administrator;
import www.healthcommunicationforum.co_zw.healthStories.healthStories;
import www.healthcommunicationforum.co_zw.healthStoriesService.healthStoriesService;

import javax.validation.Valid;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

@RestController
public class healthStoriesController {
    @Autowired
    private healthStoriesService healthstoriesservice;

    @GetMapping("/listhealthstories")
    public List<healthStories> fetchhealthStoriesList(){
        return healthstoriesservice.gethealthStoriesList();
    }
   /* @PostMapping("/addhealthstories")
    public String savehealthstories(@Valid @RequestBody MultipartFile file, healthStories healthstories){
        healthStories hs = new healthStories();
        hs.setHeading_of_story("heading_of_story");
        hs.setThe_story("the_story");
        hs.setImage("image");
        hs.setDatetime("Datetime");
        healthstoriesservice.savehealthstories(healthstories);
        return "redirect:/add";
       // return new ResponseEntity<Expense>(expenseOne, HttpStatus.OK);
    }*/

    @PostMapping("/addhealth")
    public String savehealth( healthStories healthstories, @RequestParam(value = "heading_of_story", required = false) String heading_of_story, @RequestParam(value = "the_story", required = false) String the_story, @RequestParam(value = "image") byte[] image, @RequestParam(value = "Datetime", required = false) String Datetime){
healthstoriesservice.saveHealthStories(heading_of_story, the_story, image, Datetime);
return "saved";
    }
}
