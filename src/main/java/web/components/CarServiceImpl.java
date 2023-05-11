package web.components;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getCars(List<Car> cars, int count) {
        List<Car> res = new ArrayList<>();
        while (res.size() < count && res.size() < cars.size()) {
            res.add(cars.get(res.size()));
        }
        return res;
    }
}
