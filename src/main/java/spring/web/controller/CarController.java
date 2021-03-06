package spring.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.service.CarService;


@Controller
public class CarController {
    @Autowired
   private CarService carService;

    @GetMapping(value = "cars")
    public String printWelcome(@RequestParam(value = "count", required = false)
                                           Integer count, ModelMap model) {
        model.addAttribute("carList", carService.getListFromService(count));
        return "cars";
    }
}
