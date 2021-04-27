package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

@Controller
public class CarController {


    @GetMapping(value = "cars")

    public String printWelcome(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
    CarService carService = new CarService();
        model.addAttribute("carList",carService.getListFromService(count));

       /* if (count == null || count >= 5) {
            model.addAttribute("carList", carDao.getCarList());
        } else {
            model.addAttribute("carList", carDao.getCarList().subList(0, count));
        }*/
        return "cars";
    }
}
