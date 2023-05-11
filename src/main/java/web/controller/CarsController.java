package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.components.CarService;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarsController {

    private static final List<Car> carList = new ArrayList<>();
    private final CarService carService;
    CarsController(CarService carService) {
        this.carService = carService;
        carList.add(new Car("BMW", 211332, 2020));
        carList.add(new Car("Toyota", 640780, 2023));
        carList.add(new Car("Audi", 890001, 2009));
        carList.add(new Car("Nissan", 908971, 2018));
        carList.add(new Car("Lexus", 760090, 2021));
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam Optional<Integer> count, ModelMap modelMap) {
        modelMap.addAttribute("cars", carService.getCars(carList, count.orElse(carList.size())));
        return "cars";
    }
}
