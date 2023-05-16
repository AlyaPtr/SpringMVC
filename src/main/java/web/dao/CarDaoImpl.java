package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private final List<Car> carList = new ArrayList<>();

    CarDaoImpl() {
        carList.add(new Car("BMW", 211332, 2020));
        carList.add(new Car("Toyota", 640780, 2023));
        carList.add(new Car("Audi", 890001, 2009));
        carList.add(new Car("Nissan", 908971, 2018));
        carList.add(new Car("Lexus", 760090, 2021));
    }


    @Override
    public List<Car> getCars(int count) {
        List<Car> res = new ArrayList<>();
        while (res.size() < carList.size() && res.size() < count) {
            res.add(carList.get(res.size()));
        }
        return res;
    }

    @Override
    public int getSize() {
        return carList.size();
    }
}
