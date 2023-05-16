package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.components.CarService;

import java.util.Optional;

@Controller
public class CarsController {

    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam Optional<Integer> count, ModelMap modelMap) {
        modelMap.addAttribute("cars", carService.getCars(count.orElse(carService.getSize())));
        return "cars";
    }
}
