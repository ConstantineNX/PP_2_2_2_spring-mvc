package web.controller;

import model.CarModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarsService;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarsController {

    private final CarsService carsService;

    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping(value = "/cars")
    public String getCountCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<CarModel> allCars = carsService.getAllCar();
        List<CarModel> cars;
        if (count > allCars.size()) {
            cars = allCars;
        } else {
            cars = allCars.stream().limit(count).collect(Collectors.toList());
        }
        model.addAttribute("carModels", cars);
        return "cars";
    }
}
