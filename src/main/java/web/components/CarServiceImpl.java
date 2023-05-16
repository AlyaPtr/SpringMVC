package web.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    CarDaoImpl carDao;
    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }

    @Override
    public int getSize() {
        return carDao.getSize();
    }
}
