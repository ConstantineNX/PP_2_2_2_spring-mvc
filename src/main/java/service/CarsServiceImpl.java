package service;

import dao.CarsDao;
import model.CarModel;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarsServiceImpl implements CarsService {
    private final CarsDao carsDao;

    public CarsServiceImpl(CarsDao carsDao) {
        this.carsDao = carsDao;
    }


    @Override
    public List<CarModel> getCountCar(int count) {
        return  carsDao.getCountCar().stream()
                .limit(Math.max(0, count))
                .collect(Collectors.toList());
    }
}
