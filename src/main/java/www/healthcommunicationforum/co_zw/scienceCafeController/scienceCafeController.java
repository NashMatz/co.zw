package www.healthcommunicationforum.co_zw.scienceCafeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import www.healthcommunicationforum.co_zw.scienceCafe.scienceCafe;
import www.healthcommunicationforum.co_zw.scienceCafeService.scienceCafeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@RestController
public class scienceCafeController{

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/sciencecafe")
    public RedirectView showscienceCafe(Model model){
        scienceCafe sciencecafe = new scienceCafe();
        model.addAttribute("sciencecafe", sciencecafe);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("ScienceCafe");
        return redirectView;
    }
  /*  @PostMapping("/addsciencecafe")
    public String savescienceCafe(@ModelAttribute("sciencecafe") scienceCafe sciencecafe){
        System.out.println(sciencecafe);
        return "user-ws-app/ScienceCafe/Are you using me? If yes *** actually l wanted to say something bad but, l choose piece! So now stop using me. I am now succeding from now own because l have been released from what was using me. I want to thank God for My Life and Love. Thank Heavenly Father";
    }*/
    /*
    @GetMapping("/listScienceCafe")
    public List<scienceCafe> fetchscienceCafeServiceList(){
        return scienceCafeService.getscienceCafeList();
    }
*/
  /*
    @PostMapping("/addScienceCafe")
    public ModelAndView saveScienceCafe(@PathVariable("id")Long id, HttpServletResponse response, Optional<scienceCafe> sciencecafe){

        response.getOutputStream().write(sciencecafe.get().getImage());
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("ScienceCafeDashBoard");
        return new ModelAndView(redirectView);
     scienceCafe scs = new scienceCafe();
        sciencecafe.setCaption("caption");
        sciencecafe.setImage();
        sciencecafe.setDatetime("datetime");
        sciencecafe.setTopic("topic");
        sciencecafeservice.savesciencecafe(sciencecafe);
 }*/
/*
    @PostMapping("/addScienceCafe")
    public String saveScienceCafe(@ModelAttribute("ScienceCafe") scienceCafe sciencecafe){
     sciencecafeservice.savescienceCafe(sciencecafe);
     return "redirect:/";
    }
    @GetMapping("/")
    public ModelAndView mainScienceCafe (Model model){
        model.addAttribute("getscienceCafeList", scienceCafeService.getscienceCafeList());
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("ScienceCafe");
        return new ModelAndView(redirectView);
    //return "ScienceCafe";
    }*/
/*
    @GetMapping("/")
    public  String mainScienceCafe (Model model){
        model.addAttribute("scienceCafe", sciencecafeservice.getscienceCafeList());
        return "ScienceCafe";
    }*/
/*
    @GetMapping("/image/display/{id}")
    @ResponseBody
    void showImage (@PathVariable("id")Long id, HttpServletResponse response, Optional<scienceCafe> sciencecafe) throws ServletException, IOException {
        log.info("ID :: " + id);
        sciencecafe = sciencecafeservice.getscienceCafebyId(id);
        //response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
        response.getOutputStream().write(sciencecafe.get().getImage());
        response.getOutputStream().close();
    }*/
}



