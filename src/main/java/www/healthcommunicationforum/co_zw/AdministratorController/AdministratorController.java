package www.healthcommunicationforum.co_zw.AdministratorController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import www.healthcommunicationforum.co_zw.Administrator.Administrator;
import www.healthcommunicationforum.co_zw.AdministratorService.AdministratorService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AdministratorController {
    @Autowired
    private AdministratorService administratorService;

    public AdministratorController(AdministratorService administratorService) {
        super();
        this.administratorService = administratorService;
    }
    @PostMapping("/saveadmin")
    public ModelAndView saveAdministrator(@Valid @RequestBody Administrator administrator) {
        administratorService.saveAdministrator(administrator);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/CreateAdministrator");

       return new ModelAndView(redirectView);

      //  return "redirect:/CreateAdministrator.html";
    }

    @GetMapping("/adminlist")
    public List<Administrator> adminList(){
        return administratorService.adminlist();
    }
}