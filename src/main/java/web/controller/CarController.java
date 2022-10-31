package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    /*в конце URL придется поставить наклонную )) */
    @GetMapping("/")
    public String getCars(@RequestParam(value = "count",defaultValue = "0") Integer count, Model model) {
        List<Car> carList = CarService.getCarList();
        model.addAttribute("count",count);
        model.addAttribute("carsList",carList);
        return "cars";
    }
}
