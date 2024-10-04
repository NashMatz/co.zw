package www.healthcommunicationforum.co_zw.loginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import www.healthcommunicationforum.co_zw.login.Login;
import www.healthcommunicationforum.co_zw.loginService.LoginService;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.Objects;

@RestController
public class loginController {

    @Autowired
    private LoginService loginservice;

    @GetMapping("/adminlogin")
    public ModelAndView login(){
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("adminlogin", new Login());
        return mav;
        }

        @PostMapping(value = "/addlogin")
        public String addlogin (@Valid @RequestBody Login login){
        Login lgn = new Login();
        lgn.setEmail("email");
        lgn.setPassword("email");

        loginservice.addloginAdmn(login);
        return "saved";
        }

    @PostMapping(value = "/adminlogin")
    public String login (@ModelAttribute("user") Login logn){

        Login authlogin = loginservice.login(logn.getEmail(), logn.getPassword());

        System.out.print(authlogin);
        if(Objects.nonNull(authlogin))
        {
            return "redirect:/";
        }else {
            return "redirect:/login";
        }
    }

    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request, HttpServletResponse response)
    {
        return "redirect:/login";
    }
}
