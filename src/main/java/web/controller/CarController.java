package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CountCar;
import web.service.CountCarImpl;

@Controller
public class CarController {

    @Autowired
    private CountCar countCar;

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count == null) {
            model.addAttribute("listCars", countCar.allListCar());
        } else {
            model.addAttribute("listCars", countCar.countCars(count));
        }
        return "cars";
    }
}
