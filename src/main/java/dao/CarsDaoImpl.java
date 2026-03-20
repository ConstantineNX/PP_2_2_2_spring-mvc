package dao;

import model.CarModel;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class CarsDaoImpl implements CarsDao {
    private final List<CarModel> cars = new ArrayList<CarModel>();

    public CarsDaoImpl() {
        cars.add(new CarModel(1,"HONDA", "ACCORD", 2005, 2.5, 190, 2_000_000));
        cars.add(new CarModel(2,"KIA", "RIO", 2015, 1.6, 170, 1_100_000));
        cars.add(new CarModel(3,"LADA", "PRIORA", 2012, 1.6, 183, 400_000));
        cars.add(new CarModel(4,"BMW", "X3", 2018, 3.0, 220, 2_400_000));
        cars.add(new CarModel(5,"TOYOTA", "CAMRI", 2007, 3.5, 210, 1_200_000));
    }

    @Override
    public List<CarModel> getCountCar() {
        return cars;
    }
}
