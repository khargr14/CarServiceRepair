package services;

import binary.CarDetails;
import dao.imple.CarDao;

public class CarInfoService implements ICarDetails {
    CarDao dao = new CarDao();
    public void addNewCar(int year,String modelnumber,String manufacturingnumber){

        CarDetails userInfo= new CarDetails(year,modelnumber,manufacturingnumber);

        dao.Insert_Car(userInfo);

    }

}
