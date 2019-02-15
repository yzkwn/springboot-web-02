package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/boot")
public class JspController {

    @RequestMapping("/index")
    public ModelAndView index(Model model) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("msg", "Spring Boot Hello");
        return mv;
    }

    @GetMapping("/log")
    public String log(Model model) {
        ModelAndView mv = new ModelAndView();
        model.addAttribute("msg", "Spring Boot Hello HHHH ");
        return "index";
    }
}
