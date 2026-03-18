package web.controller;

import model.CarModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarsService;
import java.util.List;


@Controller
public class CarsController {
    private final CarsService carsService;

    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping(value = "/cars")
    public String getCountCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<CarModel> cars = carsService.getCountCar(count);
        model.addAttribute("carModels",cars);
        return "cars";
    }
}
